package com.ma.learn.join;

public class DemoJoin {

  public static void main(String[] args) {
    NewThread one = new NewThread("One");
    NewThread two = new NewThread("TWO");
    NewThread three = new NewThread("THREE");

    one.t.start();
    two.t.start();
    three.t.start();

    System.out.println("Thread ONE is alive:" + one.t.isAlive());
    System.out.println("Thread TWO is alive:" + two.t.isAlive());
    System.out.println("Thread THREE is alive:" + three.t.isAlive());

    try{
      System.out.println("Waiting for thread to finish.");
      one.t.join();
      two.t.join();
      three.t.join();
    } catch (InterruptedException e){
      System.out.println("MAIN THREAD INTERRUPTED.");
    }

    System.out.println("Thread ONE is alive:" + one.t.isAlive());
    System.out.println("Thread TWO is alive:" + two.t.isAlive());
    System.out.println("Thread THREE is alive:" + three.t.isAlive());

    System.out.println("main thread exiting.");
  }
}
