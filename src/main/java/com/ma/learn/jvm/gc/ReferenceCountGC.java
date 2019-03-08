/**
 * Copyright ©2014-2018 Youzan.com All rights reserved
 * com.ma.learn.jvm.gc
 */
package com.ma.learn.jvm.gc;

/**
 *
 * @author maxiaogang
 * @date 2018/10/8 22:50
 */
public class ReferenceCountGC {

    public Object instance = null;

    private static final int _1MB= 1024*1024;

    private byte[] bigSize = new byte[2 * _1MB];

    public static void main(String[] args) {
        ReferenceCountGC object1 = new ReferenceCountGC();
        ReferenceCountGC object2 = new ReferenceCountGC();
        object1.instance = object2;
        object2.instance = object1;

        object1 = null;
        object2 = null;

        System.gc();

    }
}
