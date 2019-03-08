package com.ma.learn.synchronization;

public class Consumer implements Runnable{

  Q q;

  Thread t;

  Consumer(Q q){
    this.q = q;
    t = new Thread(this, "Consumer");
  }

  @Override
  public void run() {
    while (true){
      q.get();
      try{
        Thread.sleep(500);
      }catch (InterruptedException e){
        System.out.println("CONSUMER INTERRUPTED.");
      }
    }
  }
}
