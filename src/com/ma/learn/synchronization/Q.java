package com.ma.learn.synchronization;

public class Q {
  int n;

  synchronized int get(){
    System.out.println("GOT " + n);
    return n;
  }

  synchronized void put(int n){
    this.n = n;
    System.out.println("PUT " + n);
  }

}
