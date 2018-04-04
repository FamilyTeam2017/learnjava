package com.ma.learn.concurrency;

public class UnsafeSequence {

  private long value;

  public long getNext(){
    return value++;
  }

}
