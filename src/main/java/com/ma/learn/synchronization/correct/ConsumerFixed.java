package com.ma.learn.synchronization.correct;

public class ConsumerFixed implements Runnable{

  QFixed q;

  Thread t;

  ConsumerFixed(QFixed q){
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
