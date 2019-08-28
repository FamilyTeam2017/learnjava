package com.ma.learn.multithreads;

public class ThreadLocalDemo2 {

    public static void main(String[] args) throws InterruptedException {
        ThreadLocal<String> mainThreadLocal = new ThreadLocal<>();
        mainThreadLocal.set("traceIDMain");
            new Thread(() -> {
                long millin = System.currentTimeMillis();
                System.out.println("mainThreadLocal is ["+ millin +"] :" + mainThreadLocal.get());
                mainThreadLocal.set("updatedTraceIDMain" + millin);
                System.out.println("mainThreadLocal "+millin+"is updated to : :" + mainThreadLocal.get());
                ThreadLocal<String> subThreadLocal = new ThreadLocal<>();
                subThreadLocal.set("subThread" + millin);
                System.out.println("sub thread "+millin+" local is :" + subThreadLocal.get());
            }).start();
            Thread.sleep(10000);
        System.out.println("result is updated to : :" + mainThreadLocal.get());
    }
}
