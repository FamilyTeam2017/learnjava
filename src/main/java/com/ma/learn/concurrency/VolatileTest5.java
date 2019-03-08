package com.ma.learn.concurrency;

import com.ma.learn.concurrency.testEntity.VolatileTestEntity;

public class VolatileTest5 {

  public static void main(String[] args) throws InterruptedException {
    VolatileTestEntity entity = new VolatileTestEntity();
    new Thread(() -> {
      while (entity.isSleep()){
        System.out.println("entity is sleep.");
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      System.out.println("awake.");
    }).start();
    Thread.sleep(3000);
    new Thread(() -> {
      entity.setSleep(false);
      System.out.println("entity awake.");
    }).start();
  }

}
