package com.ma.learn.synchronization.correct;

import com.ma.learn.synchronization.Q;

public class ProducerFixed implements Runnable{

  QFixed q;
  Thread t;

  ProducerFixed(QFixed q){
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
