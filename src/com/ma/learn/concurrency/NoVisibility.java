package com.ma.learn.concurrency;

/**
 * 可见性
 */
public class NoVisibility {
  private static boolean ready;
  private static int number;

  public static void main(String[] args) throws InterruptedException {
    new ReaderThread().start();
    Thread.sleep(10000l);
    number = 42;
    ready = true;
  }

  private static class ReaderThread extends Thread {

    public void run(){
      while (!ready){
        Thread.yield();
      }
      System.out.println(number);
    }
  }
}
