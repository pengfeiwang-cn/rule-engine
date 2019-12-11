package com.yunli.bigdata.runengine.runtime;

import com.google.protobuf.CodedInputStream;
import com.yunli.bigdata.eventbus.apis.common.Common;
import com.yunli.bigdata.eventbus.common.BytesCache;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;

/**
 * @author wangpengfei
 * @date 2019/12/5
 */
public abstract class Processor {
    protected Collector collector = new Collector();
    private DataInputStream input = new DataInputStream(System.in);
    private BytesCache buffer = new BytesCache(1024);

    public abstract void init(Map<String, Object> conf) throws Exception;

    protected abstract void process(Common.Event event) throws Exception;

    public void main() throws Exception {
        while (true) { // well, this is java.
            int size = input.readInt();
            if (size <= 0) {
                throw new IOException(String.format("Size of event(=%d) should be positive.", size));
            }
            byte[] buf = buffer.resize(size).getBuffer();
            int read = input.read(buf, 0, size);
            while (read < size) {
                int gotten = input.read(buf, read, size - read);
                if (gotten == 0) {
                    throw new IOException("DataInputReader.read() return 0.");
                }
                read += gotten;
            }
            Common.Event event = Common.Event.parseFrom(CodedInputStream.newInstance(buffer.getBuffer(), 0, size));
            process(event);
        }
    }
}
