package com.yunli.bigdata.runengine.apis;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: apis.proto")
public final class EngineGrpc {

  private EngineGrpc() {}

  public static final String SERVICE_NAME = "apis.Engine";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.yunli.bigdata.runengine.apis.Apis.CreateEnvironmentRequest,
      com.yunli.bigdata.runengine.apis.Apis.CreateEnvironmentResponse> getCreateEnvironmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEnvironment",
      requestType = com.yunli.bigdata.runengine.apis.Apis.CreateEnvironmentRequest.class,
      responseType = com.yunli.bigdata.runengine.apis.Apis.CreateEnvironmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yunli.bigdata.runengine.apis.Apis.CreateEnvironmentRequest,
      com.yunli.bigdata.runengine.apis.Apis.CreateEnvironmentResponse> getCreateEnvironmentMethod() {
    io.grpc.MethodDescriptor<com.yunli.bigdata.runengine.apis.Apis.CreateEnvironmentRequest, com.yunli.bigdata.runengine.apis.Apis.CreateEnvironmentResponse> getCreateEnvironmentMethod;
    if ((getCreateEnvironmentMethod = EngineGrpc.getCreateEnvironmentMethod) == null) {
      synchronized (EngineGrpc.class) {
        if ((getCreateEnvironmentMethod = EngineGrpc.getCreateEnvironmentMethod) == null) {
          EngineGrpc.getCreateEnvironmentMethod = getCreateEnvironmentMethod =
              io.grpc.MethodDescriptor.<com.yunli.bigdata.runengine.apis.Apis.CreateEnvironmentRequest, com.yunli.bigdata.runengine.apis.Apis.CreateEnvironmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEnvironment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yunli.bigdata.runengine.apis.Apis.CreateEnvironmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yunli.bigdata.runengine.apis.Apis.CreateEnvironmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EngineMethodDescriptorSupplier("CreateEnvironment"))
              .build();
        }
      }
    }
    return getCreateEnvironmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yunli.bigdata.runengine.apis.Apis.UploadRequest,
      com.yunli.bigdata.runengine.apis.Apis.UploadResponse> getUploadEnvironmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadEnvironment",
      requestType = com.yunli.bigdata.runengine.apis.Apis.UploadRequest.class,
      responseType = com.yunli.bigdata.runengine.apis.Apis.UploadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.yunli.bigdata.runengine.apis.Apis.UploadRequest,
      com.yunli.bigdata.runengine.apis.Apis.UploadResponse> getUploadEnvironmentMethod() {
    io.grpc.MethodDescriptor<com.yunli.bigdata.runengine.apis.Apis.UploadRequest, com.yunli.bigdata.runengine.apis.Apis.UploadResponse> getUploadEnvironmentMethod;
    if ((getUploadEnvironmentMethod = EngineGrpc.getUploadEnvironmentMethod) == null) {
      synchronized (EngineGrpc.class) {
        if ((getUploadEnvironmentMethod = EngineGrpc.getUploadEnvironmentMethod) == null) {
          EngineGrpc.getUploadEnvironmentMethod = getUploadEnvironmentMethod =
              io.grpc.MethodDescriptor.<com.yunli.bigdata.runengine.apis.Apis.UploadRequest, com.yunli.bigdata.runengine.apis.Apis.UploadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadEnvironment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yunli.bigdata.runengine.apis.Apis.UploadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yunli.bigdata.runengine.apis.Apis.UploadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EngineMethodDescriptorSupplier("UploadEnvironment"))
              .build();
        }
      }
    }
    return getUploadEnvironmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yunli.bigdata.runengine.apis.Apis.DropEnvironmentRequest,
      com.yunli.bigdata.runengine.apis.Apis.DropEnvironmentResponse> getDropEnvironmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DropEnvironment",
      requestType = com.yunli.bigdata.runengine.apis.Apis.DropEnvironmentRequest.class,
      responseType = com.yunli.bigdata.runengine.apis.Apis.DropEnvironmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yunli.bigdata.runengine.apis.Apis.DropEnvironmentRequest,
      com.yunli.bigdata.runengine.apis.Apis.DropEnvironmentResponse> getDropEnvironmentMethod() {
    io.grpc.MethodDescriptor<com.yunli.bigdata.runengine.apis.Apis.DropEnvironmentRequest, com.yunli.bigdata.runengine.apis.Apis.DropEnvironmentResponse> getDropEnvironmentMethod;
    if ((getDropEnvironmentMethod = EngineGrpc.getDropEnvironmentMethod) == null) {
      synchronized (EngineGrpc.class) {
        if ((getDropEnvironmentMethod = EngineGrpc.getDropEnvironmentMethod) == null) {
          EngineGrpc.getDropEnvironmentMethod = getDropEnvironmentMethod =
              io.grpc.MethodDescriptor.<com.yunli.bigdata.runengine.apis.Apis.DropEnvironmentRequest, com.yunli.bigdata.runengine.apis.Apis.DropEnvironmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DropEnvironment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yunli.bigdata.runengine.apis.Apis.DropEnvironmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yunli.bigdata.runengine.apis.Apis.DropEnvironmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EngineMethodDescriptorSupplier("DropEnvironment"))
              .build();
        }
      }
    }
    return getDropEnvironmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yunli.bigdata.runengine.apis.Apis.GetEnvironmentsRequest,
      com.yunli.bigdata.runengine.apis.Apis.Environment> getGetEnvironmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEnvironments",
      requestType = com.yunli.bigdata.runengine.apis.Apis.GetEnvironmentsRequest.class,
      responseType = com.yunli.bigdata.runengine.apis.Apis.Environment.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.yunli.bigdata.runengine.apis.Apis.GetEnvironmentsRequest,
      com.yunli.bigdata.runengine.apis.Apis.Environment> getGetEnvironmentsMethod() {
    io.grpc.MethodDescriptor<com.yunli.bigdata.runengine.apis.Apis.GetEnvironmentsRequest, com.yunli.bigdata.runengine.apis.Apis.Environment> getGetEnvironmentsMethod;
    if ((getGetEnvironmentsMethod = EngineGrpc.getGetEnvironmentsMethod) == null) {
      synchronized (EngineGrpc.class) {
        if ((getGetEnvironmentsMethod = EngineGrpc.getGetEnvironmentsMethod) == null) {
          EngineGrpc.getGetEnvironmentsMethod = getGetEnvironmentsMethod =
              io.grpc.MethodDescriptor.<com.yunli.bigdata.runengine.apis.Apis.GetEnvironmentsRequest, com.yunli.bigdata.runengine.apis.Apis.Environment>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEnvironments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yunli.bigdata.runengine.apis.Apis.GetEnvironmentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yunli.bigdata.runengine.apis.Apis.Environment.getDefaultInstance()))
              .setSchemaDescriptor(new EngineMethodDescriptorSupplier("GetEnvironments"))
              .build();
        }
      }
    }
    return getGetEnvironmentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yunli.bigdata.runengine.apis.Apis.GetEnvironmentRequest,
      com.yunli.bigdata.runengine.apis.Apis.Environment> getGetEnvironmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEnvironment",
      requestType = com.yunli.bigdata.runengine.apis.Apis.GetEnvironmentRequest.class,
      responseType = com.yunli.bigdata.runengine.apis.Apis.Environment.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yunli.bigdata.runengine.apis.Apis.GetEnvironmentRequest,
      com.yunli.bigdata.runengine.apis.Apis.Environment> getGetEnvironmentMethod() {
    io.grpc.MethodDescriptor<com.yunli.bigdata.runengine.apis.Apis.GetEnvironmentRequest, com.yunli.bigdata.runengine.apis.Apis.Environment> getGetEnvironmentMethod;
    if ((getGetEnvironmentMethod = EngineGrpc.getGetEnvironmentMethod) == null) {
      synchronized (EngineGrpc.class) {
        if ((getGetEnvironmentMethod = EngineGrpc.getGetEnvironmentMethod) == null) {
          EngineGrpc.getGetEnvironmentMethod = getGetEnvironmentMethod =
              io.grpc.MethodDescriptor.<com.yunli.bigdata.runengine.apis.Apis.GetEnvironmentRequest, com.yunli.bigdata.runengine.apis.Apis.Environment>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEnvironment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yunli.bigdata.runengine.apis.Apis.GetEnvironmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yunli.bigdata.runengine.apis.Apis.Environment.getDefaultInstance()))
              .setSchemaDescriptor(new EngineMethodDescriptorSupplier("GetEnvironment"))
              .build();
        }
      }
    }
    return getGetEnvironmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yunli.bigdata.runengine.apis.Apis.CreateRuntimeRequest,
      com.yunli.bigdata.runengine.apis.Apis.CreateRuntimeResponse> getCreateRuntimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRuntime",
      requestType = com.yunli.bigdata.runengine.apis.Apis.CreateRuntimeRequest.class,
      responseType = com.yunli.bigdata.runengine.apis.Apis.CreateRuntimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yunli.bigdata.runengine.apis.Apis.CreateRuntimeRequest,
      com.yunli.bigdata.runengine.apis.Apis.CreateRuntimeResponse> getCreateRuntimeMethod() {
    io.grpc.MethodDescriptor<com.yunli.bigdata.runengine.apis.Apis.CreateRuntimeRequest, com.yunli.bigdata.runengine.apis.Apis.CreateRuntimeResponse> getCreateRuntimeMethod;
    if ((getCreateRuntimeMethod = EngineGrpc.getCreateRuntimeMethod) == null) {
      synchronized (EngineGrpc.class) {
        if ((getCreateRuntimeMethod = EngineGrpc.getCreateRuntimeMethod) == null) {
          EngineGrpc.getCreateRuntimeMethod = getCreateRuntimeMethod =
              io.grpc.MethodDescriptor.<com.yunli.bigdata.runengine.apis.Apis.CreateRuntimeRequest, com.yunli.bigdata.runengine.apis.Apis.CreateRuntimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRuntime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yunli.bigdata.runengine.apis.Apis.CreateRuntimeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yunli.bigdata.runengine.apis.Apis.CreateRuntimeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EngineMethodDescriptorSupplier("CreateRuntime"))
              .build();
        }
      }
    }
    return getCreateRuntimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yunli.bigdata.runengine.apis.Apis.UploadRequest,
      com.yunli.bigdata.runengine.apis.Apis.UploadResponse> getUploadRuntimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadRuntime",
      requestType = com.yunli.bigdata.runengine.apis.Apis.UploadRequest.class,
      responseType = com.yunli.bigdata.runengine.apis.Apis.UploadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.yunli.bigdata.runengine.apis.Apis.UploadRequest,
      com.yunli.bigdata.runengine.apis.Apis.UploadResponse> getUploadRuntimeMethod() {
    io.grpc.MethodDescriptor<com.yunli.bigdata.runengine.apis.Apis.UploadRequest, com.yunli.bigdata.runengine.apis.Apis.UploadResponse> getUploadRuntimeMethod;
    if ((getUploadRuntimeMethod = EngineGrpc.getUploadRuntimeMethod) == null) {
      synchronized (EngineGrpc.class) {
        if ((getUploadRuntimeMethod = EngineGrpc.getUploadRuntimeMethod) == null) {
          EngineGrpc.getUploadRuntimeMethod = getUploadRuntimeMethod =
              io.grpc.MethodDescriptor.<com.yunli.bigdata.runengine.apis.Apis.UploadRequest, com.yunli.bigdata.runengine.apis.Apis.UploadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadRuntime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yunli.bigdata.runengine.apis.Apis.UploadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yunli.bigdata.runengine.apis.Apis.UploadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EngineMethodDescriptorSupplier("UploadRuntime"))
              .build();
        }
      }
    }
    return getUploadRuntimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yunli.bigdata.runengine.apis.Apis.DropRuntimeRequest,
      com.yunli.bigdata.runengine.apis.Apis.DropRuntimeResponse> getDropRuntimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DropRuntime",
      requestType = com.yunli.bigdata.runengine.apis.Apis.DropRuntimeRequest.class,
      responseType = com.yunli.bigdata.runengine.apis.Apis.DropRuntimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yunli.bigdata.runengine.apis.Apis.DropRuntimeRequest,
      com.yunli.bigdata.runengine.apis.Apis.DropRuntimeResponse> getDropRuntimeMethod() {
    io.grpc.MethodDescriptor<com.yunli.bigdata.runengine.apis.Apis.DropRuntimeRequest, com.yunli.bigdata.runengine.apis.Apis.DropRuntimeResponse> getDropRuntimeMethod;
    if ((getDropRuntimeMethod = EngineGrpc.getDropRuntimeMethod) == null) {
      synchronized (EngineGrpc.class) {
        if ((getDropRuntimeMethod = EngineGrpc.getDropRuntimeMethod) == null) {
          EngineGrpc.getDropRuntimeMethod = getDropRuntimeMethod =
              io.grpc.MethodDescriptor.<com.yunli.bigdata.runengine.apis.Apis.DropRuntimeRequest, com.yunli.bigdata.runengine.apis.Apis.DropRuntimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DropRuntime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yunli.bigdata.runengine.apis.Apis.DropRuntimeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yunli.bigdata.runengine.apis.Apis.DropRuntimeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EngineMethodDescriptorSupplier("DropRuntime"))
              .build();
        }
      }
    }
    return getDropRuntimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yunli.bigdata.runengine.apis.Apis.GetRuntimesRequest,
      com.yunli.bigdata.runengine.apis.Apis.Runtime> getGetRuntimesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRuntimes",
      requestType = com.yunli.bigdata.runengine.apis.Apis.GetRuntimesRequest.class,
      responseType = com.yunli.bigdata.runengine.apis.Apis.Runtime.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.yunli.bigdata.runengine.apis.Apis.GetRuntimesRequest,
      com.yunli.bigdata.runengine.apis.Apis.Runtime> getGetRuntimesMethod() {
    io.grpc.MethodDescriptor<com.yunli.bigdata.runengine.apis.Apis.GetRuntimesRequest, com.yunli.bigdata.runengine.apis.Apis.Runtime> getGetRuntimesMethod;
    if ((getGetRuntimesMethod = EngineGrpc.getGetRuntimesMethod) == null) {
      synchronized (EngineGrpc.class) {
        if ((getGetRuntimesMethod = EngineGrpc.getGetRuntimesMethod) == null) {
          EngineGrpc.getGetRuntimesMethod = getGetRuntimesMethod =
              io.grpc.MethodDescriptor.<com.yunli.bigdata.runengine.apis.Apis.GetRuntimesRequest, com.yunli.bigdata.runengine.apis.Apis.Runtime>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRuntimes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yunli.bigdata.runengine.apis.Apis.GetRuntimesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yunli.bigdata.runengine.apis.Apis.Runtime.getDefaultInstance()))
              .setSchemaDescriptor(new EngineMethodDescriptorSupplier("GetRuntimes"))
              .build();
        }
      }
    }
    return getGetRuntimesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yunli.bigdata.runengine.apis.Apis.GetRuntimeRequest,
      com.yunli.bigdata.runengine.apis.Apis.Runtime> getGetRuntimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRuntime",
      requestType = com.yunli.bigdata.runengine.apis.Apis.GetRuntimeRequest.class,
      responseType = com.yunli.bigdata.runengine.apis.Apis.Runtime.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yunli.bigdata.runengine.apis.Apis.GetRuntimeRequest,
      com.yunli.bigdata.runengine.apis.Apis.Runtime> getGetRuntimeMethod() {
    io.grpc.MethodDescriptor<com.yunli.bigdata.runengine.apis.Apis.GetRuntimeRequest, com.yunli.bigdata.runengine.apis.Apis.Runtime> getGetRuntimeMethod;
    if ((getGetRuntimeMethod = EngineGrpc.getGetRuntimeMethod) == null) {
      synchronized (EngineGrpc.class) {
        if ((getGetRuntimeMethod = EngineGrpc.getGetRuntimeMethod) == null) {
          EngineGrpc.getGetRuntimeMethod = getGetRuntimeMethod =
              io.grpc.MethodDescriptor.<com.yunli.bigdata.runengine.apis.Apis.GetRuntimeRequest, com.yunli.bigdata.runengine.apis.Apis.Runtime>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRuntime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yunli.bigdata.runengine.apis.Apis.GetRuntimeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yunli.bigdata.runengine.apis.Apis.Runtime.getDefaultInstance()))
              .setSchemaDescriptor(new EngineMethodDescriptorSupplier("GetRuntime"))
              .build();
        }
      }
    }
    return getGetRuntimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yunli.bigdata.runengine.apis.Apis.ID,
      com.yunli.bigdata.runengine.apis.Apis.Binary> getDownloadEnvironmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadEnvironment",
      requestType = com.yunli.bigdata.runengine.apis.Apis.ID.class,
      responseType = com.yunli.bigdata.runengine.apis.Apis.Binary.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.yunli.bigdata.runengine.apis.Apis.ID,
      com.yunli.bigdata.runengine.apis.Apis.Binary> getDownloadEnvironmentMethod() {
    io.grpc.MethodDescriptor<com.yunli.bigdata.runengine.apis.Apis.ID, com.yunli.bigdata.runengine.apis.Apis.Binary> getDownloadEnvironmentMethod;
    if ((getDownloadEnvironmentMethod = EngineGrpc.getDownloadEnvironmentMethod) == null) {
      synchronized (EngineGrpc.class) {
        if ((getDownloadEnvironmentMethod = EngineGrpc.getDownloadEnvironmentMethod) == null) {
          EngineGrpc.getDownloadEnvironmentMethod = getDownloadEnvironmentMethod =
              io.grpc.MethodDescriptor.<com.yunli.bigdata.runengine.apis.Apis.ID, com.yunli.bigdata.runengine.apis.Apis.Binary>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadEnvironment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yunli.bigdata.runengine.apis.Apis.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yunli.bigdata.runengine.apis.Apis.Binary.getDefaultInstance()))
              .setSchemaDescriptor(new EngineMethodDescriptorSupplier("DownloadEnvironment"))
              .build();
        }
      }
    }
    return getDownloadEnvironmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yunli.bigdata.runengine.apis.Apis.ID,
      com.yunli.bigdata.runengine.apis.Apis.Binary> getDownloadRuntimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadRuntime",
      requestType = com.yunli.bigdata.runengine.apis.Apis.ID.class,
      responseType = com.yunli.bigdata.runengine.apis.Apis.Binary.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.yunli.bigdata.runengine.apis.Apis.ID,
      com.yunli.bigdata.runengine.apis.Apis.Binary> getDownloadRuntimeMethod() {
    io.grpc.MethodDescriptor<com.yunli.bigdata.runengine.apis.Apis.ID, com.yunli.bigdata.runengine.apis.Apis.Binary> getDownloadRuntimeMethod;
    if ((getDownloadRuntimeMethod = EngineGrpc.getDownloadRuntimeMethod) == null) {
      synchronized (EngineGrpc.class) {
        if ((getDownloadRuntimeMethod = EngineGrpc.getDownloadRuntimeMethod) == null) {
          EngineGrpc.getDownloadRuntimeMethod = getDownloadRuntimeMethod =
              io.grpc.MethodDescriptor.<com.yunli.bigdata.runengine.apis.Apis.ID, com.yunli.bigdata.runengine.apis.Apis.Binary>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadRuntime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yunli.bigdata.runengine.apis.Apis.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yunli.bigdata.runengine.apis.Apis.Binary.getDefaultInstance()))
              .setSchemaDescriptor(new EngineMethodDescriptorSupplier("DownloadRuntime"))
              .build();
        }
      }
    }
    return getDownloadRuntimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yunli.bigdata.runengine.apis.Apis.UpdateEnvironmentRequest,
      com.yunli.bigdata.runengine.apis.Apis.UpdateEnvironmentResponse> getUpdateEnvironmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEnvironment",
      requestType = com.yunli.bigdata.runengine.apis.Apis.UpdateEnvironmentRequest.class,
      responseType = com.yunli.bigdata.runengine.apis.Apis.UpdateEnvironmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yunli.bigdata.runengine.apis.Apis.UpdateEnvironmentRequest,
      com.yunli.bigdata.runengine.apis.Apis.UpdateEnvironmentResponse> getUpdateEnvironmentMethod() {
    io.grpc.MethodDescriptor<com.yunli.bigdata.runengine.apis.Apis.UpdateEnvironmentRequest, com.yunli.bigdata.runengine.apis.Apis.UpdateEnvironmentResponse> getUpdateEnvironmentMethod;
    if ((getUpdateEnvironmentMethod = EngineGrpc.getUpdateEnvironmentMethod) == null) {
      synchronized (EngineGrpc.class) {
        if ((getUpdateEnvironmentMethod = EngineGrpc.getUpdateEnvironmentMethod) == null) {
          EngineGrpc.getUpdateEnvironmentMethod = getUpdateEnvironmentMethod =
              io.grpc.MethodDescriptor.<com.yunli.bigdata.runengine.apis.Apis.UpdateEnvironmentRequest, com.yunli.bigdata.runengine.apis.Apis.UpdateEnvironmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEnvironment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yunli.bigdata.runengine.apis.Apis.UpdateEnvironmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yunli.bigdata.runengine.apis.Apis.UpdateEnvironmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EngineMethodDescriptorSupplier("UpdateEnvironment"))
              .build();
        }
      }
    }
    return getUpdateEnvironmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yunli.bigdata.runengine.apis.Apis.UpdateRuntimeRequest,
      com.yunli.bigdata.runengine.apis.Apis.UpdateRuntimeResponse> getUpdateRuntimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRuntime",
      requestType = com.yunli.bigdata.runengine.apis.Apis.UpdateRuntimeRequest.class,
      responseType = com.yunli.bigdata.runengine.apis.Apis.UpdateRuntimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yunli.bigdata.runengine.apis.Apis.UpdateRuntimeRequest,
      com.yunli.bigdata.runengine.apis.Apis.UpdateRuntimeResponse> getUpdateRuntimeMethod() {
    io.grpc.MethodDescriptor<com.yunli.bigdata.runengine.apis.Apis.UpdateRuntimeRequest, com.yunli.bigdata.runengine.apis.Apis.UpdateRuntimeResponse> getUpdateRuntimeMethod;
    if ((getUpdateRuntimeMethod = EngineGrpc.getUpdateRuntimeMethod) == null) {
      synchronized (EngineGrpc.class) {
        if ((getUpdateRuntimeMethod = EngineGrpc.getUpdateRuntimeMethod) == null) {
          EngineGrpc.getUpdateRuntimeMethod = getUpdateRuntimeMethod =
              io.grpc.MethodDescriptor.<com.yunli.bigdata.runengine.apis.Apis.UpdateRuntimeRequest, com.yunli.bigdata.runengine.apis.Apis.UpdateRuntimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRuntime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yunli.bigdata.runengine.apis.Apis.UpdateRuntimeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yunli.bigdata.runengine.apis.Apis.UpdateRuntimeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EngineMethodDescriptorSupplier("UpdateRuntime"))
              .build();
        }
      }
    }
    return getUpdateRuntimeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EngineStub newStub(io.grpc.Channel channel) {
    return new EngineStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EngineBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EngineBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EngineFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EngineFutureStub(channel);
  }

  /**
   */
  public static abstract class EngineImplBase implements io.grpc.BindableService {

    /**
     */
    public void createEnvironment(com.yunli.bigdata.runengine.apis.Apis.CreateEnvironmentRequest request,
        io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.CreateEnvironmentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateEnvironmentMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.UploadRequest> uploadEnvironment(
        io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.UploadResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getUploadEnvironmentMethod(), responseObserver);
    }

    /**
     */
    public void dropEnvironment(com.yunli.bigdata.runengine.apis.Apis.DropEnvironmentRequest request,
        io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.DropEnvironmentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDropEnvironmentMethod(), responseObserver);
    }

    /**
     */
    public void getEnvironments(com.yunli.bigdata.runengine.apis.Apis.GetEnvironmentsRequest request,
        io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.Environment> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEnvironmentsMethod(), responseObserver);
    }

    /**
     */
    public void getEnvironment(com.yunli.bigdata.runengine.apis.Apis.GetEnvironmentRequest request,
        io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.Environment> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEnvironmentMethod(), responseObserver);
    }

    /**
     */
    public void createRuntime(com.yunli.bigdata.runengine.apis.Apis.CreateRuntimeRequest request,
        io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.CreateRuntimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateRuntimeMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.UploadRequest> uploadRuntime(
        io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.UploadResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getUploadRuntimeMethod(), responseObserver);
    }

    /**
     */
    public void dropRuntime(com.yunli.bigdata.runengine.apis.Apis.DropRuntimeRequest request,
        io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.DropRuntimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDropRuntimeMethod(), responseObserver);
    }

    /**
     */
    public void getRuntimes(com.yunli.bigdata.runengine.apis.Apis.GetRuntimesRequest request,
        io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.Runtime> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRuntimesMethod(), responseObserver);
    }

    /**
     */
    public void getRuntime(com.yunli.bigdata.runengine.apis.Apis.GetRuntimeRequest request,
        io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.Runtime> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRuntimeMethod(), responseObserver);
    }

    /**
     */
    public void downloadEnvironment(com.yunli.bigdata.runengine.apis.Apis.ID request,
        io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.Binary> responseObserver) {
      asyncUnimplementedUnaryCall(getDownloadEnvironmentMethod(), responseObserver);
    }

    /**
     */
    public void downloadRuntime(com.yunli.bigdata.runengine.apis.Apis.ID request,
        io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.Binary> responseObserver) {
      asyncUnimplementedUnaryCall(getDownloadRuntimeMethod(), responseObserver);
    }

    /**
     */
    public void updateEnvironment(com.yunli.bigdata.runengine.apis.Apis.UpdateEnvironmentRequest request,
        io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.UpdateEnvironmentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateEnvironmentMethod(), responseObserver);
    }

    /**
     */
    public void updateRuntime(com.yunli.bigdata.runengine.apis.Apis.UpdateRuntimeRequest request,
        io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.UpdateRuntimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateRuntimeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateEnvironmentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.yunli.bigdata.runengine.apis.Apis.CreateEnvironmentRequest,
                com.yunli.bigdata.runengine.apis.Apis.CreateEnvironmentResponse>(
                  this, METHODID_CREATE_ENVIRONMENT)))
          .addMethod(
            getUploadEnvironmentMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.yunli.bigdata.runengine.apis.Apis.UploadRequest,
                com.yunli.bigdata.runengine.apis.Apis.UploadResponse>(
                  this, METHODID_UPLOAD_ENVIRONMENT)))
          .addMethod(
            getDropEnvironmentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.yunli.bigdata.runengine.apis.Apis.DropEnvironmentRequest,
                com.yunli.bigdata.runengine.apis.Apis.DropEnvironmentResponse>(
                  this, METHODID_DROP_ENVIRONMENT)))
          .addMethod(
            getGetEnvironmentsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.yunli.bigdata.runengine.apis.Apis.GetEnvironmentsRequest,
                com.yunli.bigdata.runengine.apis.Apis.Environment>(
                  this, METHODID_GET_ENVIRONMENTS)))
          .addMethod(
            getGetEnvironmentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.yunli.bigdata.runengine.apis.Apis.GetEnvironmentRequest,
                com.yunli.bigdata.runengine.apis.Apis.Environment>(
                  this, METHODID_GET_ENVIRONMENT)))
          .addMethod(
            getCreateRuntimeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.yunli.bigdata.runengine.apis.Apis.CreateRuntimeRequest,
                com.yunli.bigdata.runengine.apis.Apis.CreateRuntimeResponse>(
                  this, METHODID_CREATE_RUNTIME)))
          .addMethod(
            getUploadRuntimeMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.yunli.bigdata.runengine.apis.Apis.UploadRequest,
                com.yunli.bigdata.runengine.apis.Apis.UploadResponse>(
                  this, METHODID_UPLOAD_RUNTIME)))
          .addMethod(
            getDropRuntimeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.yunli.bigdata.runengine.apis.Apis.DropRuntimeRequest,
                com.yunli.bigdata.runengine.apis.Apis.DropRuntimeResponse>(
                  this, METHODID_DROP_RUNTIME)))
          .addMethod(
            getGetRuntimesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.yunli.bigdata.runengine.apis.Apis.GetRuntimesRequest,
                com.yunli.bigdata.runengine.apis.Apis.Runtime>(
                  this, METHODID_GET_RUNTIMES)))
          .addMethod(
            getGetRuntimeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.yunli.bigdata.runengine.apis.Apis.GetRuntimeRequest,
                com.yunli.bigdata.runengine.apis.Apis.Runtime>(
                  this, METHODID_GET_RUNTIME)))
          .addMethod(
            getDownloadEnvironmentMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.yunli.bigdata.runengine.apis.Apis.ID,
                com.yunli.bigdata.runengine.apis.Apis.Binary>(
                  this, METHODID_DOWNLOAD_ENVIRONMENT)))
          .addMethod(
            getDownloadRuntimeMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.yunli.bigdata.runengine.apis.Apis.ID,
                com.yunli.bigdata.runengine.apis.Apis.Binary>(
                  this, METHODID_DOWNLOAD_RUNTIME)))
          .addMethod(
            getUpdateEnvironmentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.yunli.bigdata.runengine.apis.Apis.UpdateEnvironmentRequest,
                com.yunli.bigdata.runengine.apis.Apis.UpdateEnvironmentResponse>(
                  this, METHODID_UPDATE_ENVIRONMENT)))
          .addMethod(
            getUpdateRuntimeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.yunli.bigdata.runengine.apis.Apis.UpdateRuntimeRequest,
                com.yunli.bigdata.runengine.apis.Apis.UpdateRuntimeResponse>(
                  this, METHODID_UPDATE_RUNTIME)))
          .build();
    }
  }

  /**
   */
  public static final class EngineStub extends io.grpc.stub.AbstractStub<EngineStub> {
    private EngineStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EngineStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EngineStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EngineStub(channel, callOptions);
    }

    /**
     */
    public void createEnvironment(com.yunli.bigdata.runengine.apis.Apis.CreateEnvironmentRequest request,
        io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.CreateEnvironmentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateEnvironmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.UploadRequest> uploadEnvironment(
        io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.UploadResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getUploadEnvironmentMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void dropEnvironment(com.yunli.bigdata.runengine.apis.Apis.DropEnvironmentRequest request,
        io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.DropEnvironmentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDropEnvironmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEnvironments(com.yunli.bigdata.runengine.apis.Apis.GetEnvironmentsRequest request,
        io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.Environment> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetEnvironmentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEnvironment(com.yunli.bigdata.runengine.apis.Apis.GetEnvironmentRequest request,
        io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.Environment> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEnvironmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createRuntime(com.yunli.bigdata.runengine.apis.Apis.CreateRuntimeRequest request,
        io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.CreateRuntimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateRuntimeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.UploadRequest> uploadRuntime(
        io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.UploadResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getUploadRuntimeMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void dropRuntime(com.yunli.bigdata.runengine.apis.Apis.DropRuntimeRequest request,
        io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.DropRuntimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDropRuntimeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRuntimes(com.yunli.bigdata.runengine.apis.Apis.GetRuntimesRequest request,
        io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.Runtime> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetRuntimesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRuntime(com.yunli.bigdata.runengine.apis.Apis.GetRuntimeRequest request,
        io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.Runtime> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRuntimeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void downloadEnvironment(com.yunli.bigdata.runengine.apis.Apis.ID request,
        io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.Binary> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getDownloadEnvironmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void downloadRuntime(com.yunli.bigdata.runengine.apis.Apis.ID request,
        io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.Binary> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getDownloadRuntimeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEnvironment(com.yunli.bigdata.runengine.apis.Apis.UpdateEnvironmentRequest request,
        io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.UpdateEnvironmentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateEnvironmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateRuntime(com.yunli.bigdata.runengine.apis.Apis.UpdateRuntimeRequest request,
        io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.UpdateRuntimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateRuntimeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EngineBlockingStub extends io.grpc.stub.AbstractStub<EngineBlockingStub> {
    private EngineBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EngineBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EngineBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EngineBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.yunli.bigdata.runengine.apis.Apis.CreateEnvironmentResponse createEnvironment(com.yunli.bigdata.runengine.apis.Apis.CreateEnvironmentRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateEnvironmentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yunli.bigdata.runengine.apis.Apis.DropEnvironmentResponse dropEnvironment(com.yunli.bigdata.runengine.apis.Apis.DropEnvironmentRequest request) {
      return blockingUnaryCall(
          getChannel(), getDropEnvironmentMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.yunli.bigdata.runengine.apis.Apis.Environment> getEnvironments(
        com.yunli.bigdata.runengine.apis.Apis.GetEnvironmentsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetEnvironmentsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yunli.bigdata.runengine.apis.Apis.Environment getEnvironment(com.yunli.bigdata.runengine.apis.Apis.GetEnvironmentRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetEnvironmentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yunli.bigdata.runengine.apis.Apis.CreateRuntimeResponse createRuntime(com.yunli.bigdata.runengine.apis.Apis.CreateRuntimeRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateRuntimeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yunli.bigdata.runengine.apis.Apis.DropRuntimeResponse dropRuntime(com.yunli.bigdata.runengine.apis.Apis.DropRuntimeRequest request) {
      return blockingUnaryCall(
          getChannel(), getDropRuntimeMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.yunli.bigdata.runengine.apis.Apis.Runtime> getRuntimes(
        com.yunli.bigdata.runengine.apis.Apis.GetRuntimesRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetRuntimesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yunli.bigdata.runengine.apis.Apis.Runtime getRuntime(com.yunli.bigdata.runengine.apis.Apis.GetRuntimeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRuntimeMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.yunli.bigdata.runengine.apis.Apis.Binary> downloadEnvironment(
        com.yunli.bigdata.runengine.apis.Apis.ID request) {
      return blockingServerStreamingCall(
          getChannel(), getDownloadEnvironmentMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.yunli.bigdata.runengine.apis.Apis.Binary> downloadRuntime(
        com.yunli.bigdata.runengine.apis.Apis.ID request) {
      return blockingServerStreamingCall(
          getChannel(), getDownloadRuntimeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yunli.bigdata.runengine.apis.Apis.UpdateEnvironmentResponse updateEnvironment(com.yunli.bigdata.runengine.apis.Apis.UpdateEnvironmentRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateEnvironmentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yunli.bigdata.runengine.apis.Apis.UpdateRuntimeResponse updateRuntime(com.yunli.bigdata.runengine.apis.Apis.UpdateRuntimeRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateRuntimeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EngineFutureStub extends io.grpc.stub.AbstractStub<EngineFutureStub> {
    private EngineFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EngineFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EngineFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EngineFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yunli.bigdata.runengine.apis.Apis.CreateEnvironmentResponse> createEnvironment(
        com.yunli.bigdata.runengine.apis.Apis.CreateEnvironmentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateEnvironmentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yunli.bigdata.runengine.apis.Apis.DropEnvironmentResponse> dropEnvironment(
        com.yunli.bigdata.runengine.apis.Apis.DropEnvironmentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDropEnvironmentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yunli.bigdata.runengine.apis.Apis.Environment> getEnvironment(
        com.yunli.bigdata.runengine.apis.Apis.GetEnvironmentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEnvironmentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yunli.bigdata.runengine.apis.Apis.CreateRuntimeResponse> createRuntime(
        com.yunli.bigdata.runengine.apis.Apis.CreateRuntimeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateRuntimeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yunli.bigdata.runengine.apis.Apis.DropRuntimeResponse> dropRuntime(
        com.yunli.bigdata.runengine.apis.Apis.DropRuntimeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDropRuntimeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yunli.bigdata.runengine.apis.Apis.Runtime> getRuntime(
        com.yunli.bigdata.runengine.apis.Apis.GetRuntimeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRuntimeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yunli.bigdata.runengine.apis.Apis.UpdateEnvironmentResponse> updateEnvironment(
        com.yunli.bigdata.runengine.apis.Apis.UpdateEnvironmentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateEnvironmentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yunli.bigdata.runengine.apis.Apis.UpdateRuntimeResponse> updateRuntime(
        com.yunli.bigdata.runengine.apis.Apis.UpdateRuntimeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateRuntimeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ENVIRONMENT = 0;
  private static final int METHODID_DROP_ENVIRONMENT = 1;
  private static final int METHODID_GET_ENVIRONMENTS = 2;
  private static final int METHODID_GET_ENVIRONMENT = 3;
  private static final int METHODID_CREATE_RUNTIME = 4;
  private static final int METHODID_DROP_RUNTIME = 5;
  private static final int METHODID_GET_RUNTIMES = 6;
  private static final int METHODID_GET_RUNTIME = 7;
  private static final int METHODID_DOWNLOAD_ENVIRONMENT = 8;
  private static final int METHODID_DOWNLOAD_RUNTIME = 9;
  private static final int METHODID_UPDATE_ENVIRONMENT = 10;
  private static final int METHODID_UPDATE_RUNTIME = 11;
  private static final int METHODID_UPLOAD_ENVIRONMENT = 12;
  private static final int METHODID_UPLOAD_RUNTIME = 13;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EngineImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EngineImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ENVIRONMENT:
          serviceImpl.createEnvironment((com.yunli.bigdata.runengine.apis.Apis.CreateEnvironmentRequest) request,
              (io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.CreateEnvironmentResponse>) responseObserver);
          break;
        case METHODID_DROP_ENVIRONMENT:
          serviceImpl.dropEnvironment((com.yunli.bigdata.runengine.apis.Apis.DropEnvironmentRequest) request,
              (io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.DropEnvironmentResponse>) responseObserver);
          break;
        case METHODID_GET_ENVIRONMENTS:
          serviceImpl.getEnvironments((com.yunli.bigdata.runengine.apis.Apis.GetEnvironmentsRequest) request,
              (io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.Environment>) responseObserver);
          break;
        case METHODID_GET_ENVIRONMENT:
          serviceImpl.getEnvironment((com.yunli.bigdata.runengine.apis.Apis.GetEnvironmentRequest) request,
              (io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.Environment>) responseObserver);
          break;
        case METHODID_CREATE_RUNTIME:
          serviceImpl.createRuntime((com.yunli.bigdata.runengine.apis.Apis.CreateRuntimeRequest) request,
              (io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.CreateRuntimeResponse>) responseObserver);
          break;
        case METHODID_DROP_RUNTIME:
          serviceImpl.dropRuntime((com.yunli.bigdata.runengine.apis.Apis.DropRuntimeRequest) request,
              (io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.DropRuntimeResponse>) responseObserver);
          break;
        case METHODID_GET_RUNTIMES:
          serviceImpl.getRuntimes((com.yunli.bigdata.runengine.apis.Apis.GetRuntimesRequest) request,
              (io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.Runtime>) responseObserver);
          break;
        case METHODID_GET_RUNTIME:
          serviceImpl.getRuntime((com.yunli.bigdata.runengine.apis.Apis.GetRuntimeRequest) request,
              (io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.Runtime>) responseObserver);
          break;
        case METHODID_DOWNLOAD_ENVIRONMENT:
          serviceImpl.downloadEnvironment((com.yunli.bigdata.runengine.apis.Apis.ID) request,
              (io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.Binary>) responseObserver);
          break;
        case METHODID_DOWNLOAD_RUNTIME:
          serviceImpl.downloadRuntime((com.yunli.bigdata.runengine.apis.Apis.ID) request,
              (io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.Binary>) responseObserver);
          break;
        case METHODID_UPDATE_ENVIRONMENT:
          serviceImpl.updateEnvironment((com.yunli.bigdata.runengine.apis.Apis.UpdateEnvironmentRequest) request,
              (io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.UpdateEnvironmentResponse>) responseObserver);
          break;
        case METHODID_UPDATE_RUNTIME:
          serviceImpl.updateRuntime((com.yunli.bigdata.runengine.apis.Apis.UpdateRuntimeRequest) request,
              (io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.UpdateRuntimeResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPLOAD_ENVIRONMENT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.uploadEnvironment(
              (io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.UploadResponse>) responseObserver);
        case METHODID_UPLOAD_RUNTIME:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.uploadRuntime(
              (io.grpc.stub.StreamObserver<com.yunli.bigdata.runengine.apis.Apis.UploadResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EngineBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EngineBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.yunli.bigdata.runengine.apis.Apis.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Engine");
    }
  }

  private static final class EngineFileDescriptorSupplier
      extends EngineBaseDescriptorSupplier {
    EngineFileDescriptorSupplier() {}
  }

  private static final class EngineMethodDescriptorSupplier
      extends EngineBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EngineMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (EngineGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EngineFileDescriptorSupplier())
              .addMethod(getCreateEnvironmentMethod())
              .addMethod(getUploadEnvironmentMethod())
              .addMethod(getDropEnvironmentMethod())
              .addMethod(getGetEnvironmentsMethod())
              .addMethod(getGetEnvironmentMethod())
              .addMethod(getCreateRuntimeMethod())
              .addMethod(getUploadRuntimeMethod())
              .addMethod(getDropRuntimeMethod())
              .addMethod(getGetRuntimesMethod())
              .addMethod(getGetRuntimeMethod())
              .addMethod(getDownloadEnvironmentMethod())
              .addMethod(getDownloadRuntimeMethod())
              .addMethod(getUpdateEnvironmentMethod())
              .addMethod(getUpdateRuntimeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
