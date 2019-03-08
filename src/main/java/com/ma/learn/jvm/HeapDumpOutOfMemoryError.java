/**
 * Copyright ©2014-2018 Youzan.com All rights reserved
 * com.ma.learn.jvm
 */
package com.ma.learn.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * VM args: -Xms20m -Xmx20m -XX:+heapDumpOnOutOfMemoryError
 * @author maxiaogang
 * @date 2018/10/7 20:02
 */
public class HeapDumpOutOfMemoryError {

    static class OOMObject {

    }


    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();
        while (true) {
            list.add(new OOMObject());
        }
    }
}
