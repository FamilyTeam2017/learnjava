package com.ma.learn.concurrency.testEntity;

public class VolatileTestEntity {
  private boolean sleep = true;

  public void setSleep(boolean sleep) {
    this.sleep = sleep;
  }

  public boolean isSleep() {
    return sleep;
  }
}
