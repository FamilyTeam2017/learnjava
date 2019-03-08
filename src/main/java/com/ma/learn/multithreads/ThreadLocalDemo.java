package com.ma.learn.multithreads;

public class ThreadLocalDemo {
  static ThreadLocal<String> traceId = new ThreadLocal<>();

  public static void main(String[] args) {
    traceId.set("" + System.currentTimeMillis());
    System.out.println(traceId.get());
    final String trace = traceId.get();
    new Thread(() ->{
      traceId.set(trace);
      System.out.println(traceId.get());
    }).start();
  }

}
