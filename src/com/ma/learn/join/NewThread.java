package com.ma.learn.join;

public class NewThread implements Runnable{

  String name;

  Thread t;

  NewThread(String threadName){
    name = threadName;
    t = new Thread(this, name);
    System.out.println("NEW Thread: " + t);
  }

  @Override
  public void run() {
    try{
      for (int i = 5; i > 0 ; i--) {
        System.out.println(name + " : " + i);
        Thread.sleep(1000);
      }
    } catch (InterruptedException e){
      System.out.println(name + " Interrupted.");
    }
    System.out.println(name + " exiting.");
  }
}
