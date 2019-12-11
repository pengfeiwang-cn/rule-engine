package com.yunli.bigdata.runengine.runtime.utils;

import com.google.gson.Gson;
import com.google.protobuf.ByteString;
import com.yunli.bigdata.runengine.apis.Apis;
import com.yunli.bigdata.runengine.apis.EngineGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @author wangpengfei
 * @date 2019/12/10
 */
public class RuleEngineHelper implements AutoCloseable {
    private static final String ENVIORNMENT_NAME = "java-rule-engine";
    private static final String CREATOR = "wangpengfei@yunlizhihui.com";
    private static final String MAIN_CLASS = "com.yunli.bigdata.runengine.runtime.Application";
    private EngineGrpc.EngineBlockingStub engine;
    private ManagedChannel channel;
    private String envAllInOneJar;
    private Apis.Environment environment;
    private EngineGrpc.EngineStub engineAsync;

    public RuleEngineHelper(String address, int port, String envAllInOneJar) throws IOException, InterruptedException {
        this.envAllInOneJar = envAllInOneJar;
        this.channel = ManagedChannelBuilder
                .forAddress(address, port)
                .usePlaintext()
                .build();
        this.engine = EngineGrpc.newBlockingStub(channel);
        this.engineAsync = EngineGrpc.newStub(channel);
        initializeJavaEnvironment();
    }

    /**
     * initialize the java environment, it's an idempotent call.
     */
    private void initializeJavaEnvironment() throws IOException, InterruptedException {
        // check if ENVIRONMENT exists
        environment = engine.getEnvironment(Apis.GetEnvironmentRequest
                .newBuilder()
                .setName(ENVIORNMENT_NAME)
                .build());

        if (environment.getName() == null || environment.getName().length() == 0) {
            // environment not exists, create & upload
            engine.createEnvironment(
                    Apis.CreateEnvironmentRequest.newBuilder()
                            .setName(ENVIORNMENT_NAME)
                            .setCreator(CREATOR)
                            .setComments("Environment for event bus, java version.")
                            .build()
            );
            environment = engine.getEnvironment(Apis.GetEnvironmentRequest.newBuilder().setName(ENVIORNMENT_NAME).build());

            Semaphore semaphore = new Semaphore(0);
            StreamObserver<Apis.UploadRequest> uploader = engineAsync.uploadEnvironment(genUploadObserver(semaphore));
            doUpload(uploader, envAllInOneJar, environment.getId());
            semaphore.acquire();
        }
    }

    private StreamObserver<Apis.UploadResponse> genUploadObserver(Semaphore semaphore) {
        return new StreamObserver<Apis.UploadResponse>() {
            @Override
            public void onNext(Apis.UploadResponse value) {
                // omitted.
            }

            @Override
            public void onError(Throwable t) {
                throw new RuntimeException("Upload environment failed.", t);
            }

            @Override
            public void onCompleted() {
                semaphore.release();
            }
        };
    }

    public long createRuntime(String javaBinaryPath,
                              String runtimeAllInOneJar,
                              String name,
                              String processorClassName,
                              Map<String, Object> processorConf,
                              String comments,
                              String creator
                              ) throws IOException, InterruptedException {
        Apis.Command cmd = Apis.Command.newBuilder()
                .setExecutable(javaBinaryPath)
                .addAllArgs(
                        Arrays.asList(
                                "-cp", String.format("./ENV/%s:./SCRIPT/%s", Paths.get(envAllInOneJar).getFileName(), Paths.get(runtimeAllInOneJar).getFileName()),
                                MAIN_CLASS,
                                "-processor_class_name", processorClassName,
                                "-conf", new Gson().toJson(processorConf))
                ).build(); // ignore env, we don't need it.
        Apis.CreateRuntimeRequest crr = Apis.CreateRuntimeRequest.newBuilder()
                .setName(name)
                .setCreator(creator)
                .setEnvironmentId(environment.getId())
                .setComments(comments)
                .setCommand(cmd)
                .build();
        long ret = engine.createRuntime(crr).getId();
        Semaphore semaphore = new Semaphore(0);
        StreamObserver<Apis.UploadRequest> uploader = engineAsync.uploadRuntime(genUploadObserver(semaphore));
        doUpload(uploader, runtimeAllInOneJar, ret);
        semaphore.acquire();
        return ret;
    }

    private byte[] compressToMemory(String file) throws IOException {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        Path path = Paths.get(file);
        ZipOutputStream compressor = new ZipOutputStream(output);
        compressor.putNextEntry(new ZipEntry(path.getFileName().toString()));
        Files.copy(path, compressor);
        compressor.flush();
        compressor.closeEntry();
        compressor.close();
        return output.toByteArray();
    }

    private void doUpload(StreamObserver<Apis.UploadRequest> uploader, String file, long target) throws IOException {
        byte[] buffer = compressToMemory(file);
        final int size = 1024 * 1024; // 1MB
        int index = 0;
        while (index + size < buffer.length) {
            uploader.onNext(Apis.UploadRequest.newBuilder()
                    .setId(target)
                    .setBytes(ByteString.copyFrom(buffer, index, size))
                    .build());
            index += size;
        }
        if (index < buffer.length) {
            uploader.onNext(Apis.UploadRequest.newBuilder()
                    .setId(target)
                    .setBytes(ByteString.copyFrom(buffer, index, buffer.length - index))
                    .build());
        }
        uploader.onCompleted();
    }

    @Override
    public void close() throws Exception {
        if (this.channel != null) {
            this.channel.shutdownNow();
        }
    }
}
