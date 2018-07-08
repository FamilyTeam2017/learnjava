package com.ma.learn.synchronization.correct;

public class QFixed {
  int n;
  boolean valueSet = false;


  synchronized int get(){
    while (!valueSet) {
      try {
        wait();
      } catch (InterruptedException e) {
        System.out.println("ERROR GET.");
      }
    }
    System.out.println("GOT " + n);
    valueSet = false;
    notify();
    return n;
  }

  synchronized void put(int n){
    while (valueSet){
      try {
        wait();
      } catch (InterruptedException e){
        System.out.println("ERROR PUT.");
      }
    }
    this.n = n;
    valueSet = true;
    System.out.println("PUT " + n);
    notify();
  }

}
