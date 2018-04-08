package com.ma.learn.concurrency;

/**
 * sleep变量不添加 volatile 与 VolatileTest 执行结果一致
 * @see VolatileTest
 */
public class VolatileTest2 {

  private static boolean sleep = false;

  public static void main(String[] args) throws InterruptedException {
    new VolatileTestAfterSleepTask(sleep).start();
    System.out.println("------");
    new VolatileTestAwakeTask(sleep).start();
    while (true) {
      System.out.println("sleep??" + sleep);
      Thread.sleep(1000l);
    }
  }
}