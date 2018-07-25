package com.ma.learn.synchronization;

import com.ma.learn.synchronization.correct.QFixed;

public class Producer implements Runnable{

  Q q;
  Thread t;

  Producer(Q q){
    this.q = q;
    t = new Thread(this, "Producer");
  }

  @Override
  public void run() {
    int i =0;
    while (true){
      q.put(i++);
      try{
        Thread.sleep(1000);
      }catch (InterruptedException e){
        System.out.println("PRODUCER INTERRUPTED.");
      }
    }
  }
}
