package com.ma.learn.concurrency;

/**
 * 验证可见性
 * 验证方案:
 * 1.设置一个 volatile 变量sleep = true;
 * 2.启动线程1,如果sleep is true,则休眠1秒后,继续判断,if the 'sleep' is false, print 'sleep over' then thread over.
 * 3.start another thread to update the 'sleep' false.
 *
 * 预期结果:
 * 线程1开始执行,然后一直循环打印,直到线程2执行完成.
 * 实际结果:
 sleeping1522981023250
 sleeping1522981024255
 sleeping1522981025259
 main thread sleep?true
 awake
 sleeping over.
 * 与预期一致
 * 但是不使用volatile时执行结果和使用volatile一致,为什么?
 * 静态变量各个线程共享;
 * @see VolatileTest4
 * 结论:
 * 静态变量各个线程共享.jdk8 静态变量存在于堆中,由所有线程共享
 */
public class VolatileTest3 {

  private static volatile boolean sleep = true;

  public static void main(String[] args) throws InterruptedException {
    new Thread(() -> {
      while (true){
        if (sleep){
          System.out.println("sleeping" + System.currentTimeMillis());
          try {
            Thread.sleep(1000l);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        } else{
          System.out.println("sleeping over.");
          break;
        }
      }
    }).start();
    Thread.sleep(3000l);
    new Thread(() -> {
      sleep = false;
      System.out.println("awake");
    }).start();
    System.out.println("main thread sleep?" + sleep);
  }

}
