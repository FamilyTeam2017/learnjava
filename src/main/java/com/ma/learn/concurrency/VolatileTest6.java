package com.ma.learn.concurrency;

/**
 * 验证volatile无法保证原子性
 */
public class VolatileTest6 {
  int num = 0;
  public void addNum(){
    try {
      Thread.sleep(100l);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    num++ ;
  }

  public int getNum() {
    return num;
  }

  public static void main(String[] args) throws InterruptedException {
    VolatileTest6 test = new VolatileTest6();
    for (int i = 0;i < 999; i++){
      new Thread(() -> {
        test.addNum();
      }).start();
    }
    while(Thread.activeCount()>1) {
      Thread.yield();
    }
    System.out.println(test.getNum());
  }

}
