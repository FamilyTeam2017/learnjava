package com.ma.learn.concurrency;

public class VolatileTestAwakeTask extends Thread {

  private Boolean asleep;

  public VolatileTestAwakeTask(Boolean asleep){
    super();
    this.asleep = asleep;
  }

  @Override
  public void run() {
    asleep = true;
    System.out.println("awaked.");
  }

}
