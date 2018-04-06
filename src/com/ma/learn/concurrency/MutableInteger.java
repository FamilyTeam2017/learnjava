package com.ma.learn.concurrency;

import net.jcip.annotations.NotThreadSafe;

@NotThreadSafe
public class MutableInteger {
  private int value;

  private int getValue(){
    return value;
  }

  private void setValue(int value){
    this.value = value;
  }
}
