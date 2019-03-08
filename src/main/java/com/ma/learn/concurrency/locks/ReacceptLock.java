package com.ma.learn.concurrency.locks;

/**
 * 尝试实现可重入锁
 */
public class ReacceptLock {

  /**
   * 用来表示该线程获取锁的次数
   */
  private int count;

  /**
   * 表示所有者线程
   */
  private String threadCode;

  public boolean getLock(String threadName){
    boolean locked = false;
    if (count == 0 || threadCode == null || threadCode.equals(threadName)){
      count++;
      this.threadCode = threadName;
      locked = true;
    }
    return locked;
  }

  public boolean loseLock(String threadName){
    if (this.threadCode == null || this.threadCode.equals(threadName)){
      count--;
    }
    return count <= 0;
  }

}
