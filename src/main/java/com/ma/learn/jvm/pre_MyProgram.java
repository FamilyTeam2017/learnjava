package com.ma.learn.jvm;

import java.lang.instrument.Instrumentation;

public class pre_MyProgram {

    public static void premain(String agentOps, Instrumentation inst){
        System.out.println("-----------premian方法执行");
        System.out.println("-----" + agentOps);
    }

    public static void premain(String agentOps){
        System.out.println("####################premain方法执行");
        System.out.println("####" + agentOps);
    }

    public static void main(String[] args) {
        System.out.println("--- mian -----");
    }
}
