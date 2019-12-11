package com.yunli.bigdata.runengine.runtime;

import com.yunli.bigdata.eventbus.apis.common.Common;

import java.io.DataOutputStream;
import java.io.IOException;

/**
 * @author wangpengfei
 * @date 2019/12/5
 */
public class Collector {
    private DataOutputStream output = new DataOutputStream(System.out);

    public void collect(Common.Event event) throws IOException {
        output.writeInt(event.getSerializedSize());
        event.writeTo(output);
        output.flush();
    }
}
