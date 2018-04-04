package com.ma.learn.concurrency;

import net.jcip.annotations.ThreadSafe;

import java.util.concurrent.atomic.AtomicLong;

@ThreadSafe
public class CountingFactorizer {

  private final AtomicLong count = new AtomicLong(0);

  public long getCount(){
    return count.get();
  }
}
