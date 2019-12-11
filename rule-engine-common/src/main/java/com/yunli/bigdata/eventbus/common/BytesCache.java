package com.yunli.bigdata.eventbus.common;

/**
 * @author wangpengfei
 * @date 2019/12/6
 */
public final class BytesCache {
    private byte[] buffer;
    public BytesCache(int capacity) {
        buffer = new byte[capacity];
    }

    public BytesCache resize(int capacity) {
        if (buffer == null || buffer.length < capacity) { // do not ask why "buffer == null", it's fucking top secret.
            buffer = new byte[capacity];
        }

        return this;
    }

    public byte[] getBuffer() {
        return buffer;
    }
}
