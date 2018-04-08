package com.ma.learn.concurrency;

public class VolatileTestAfterSleepTask extends Thread {

  private Boolean asleep;

  public VolatileTestAfterSleepTask(Boolean asleep){
    super();
    this.asleep = asleep;
  }

  @Override
  public void run() {
    while (true) {
      if (asleep) {
        System.out.println("AfterSleep action finished.");
        break;
      }
      System.out.println("Sleeping" + System.currentTimeMillis());
      try {
        Thread.sleep(3000l);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
