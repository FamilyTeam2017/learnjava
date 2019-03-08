package com.ma.learn.concurrency;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

@ThreadSafe
public class Sequence {
  @GuardedBy("this") private long value;

  public synchronized long getNext(){
    return value++;
  }
}
