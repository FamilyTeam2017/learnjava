package com.ma.learn.concurrency;

import net.jcip.annotations.NotThreadSafe;

import java.util.ArrayList;
import java.util.List;

/**
 * 存在线程安全问题
 */
@NotThreadSafe
public class LazyInitRace {
  private List list;

  public List getInstance(String str){
    if (list == null){
      System.out.println("this is a new instance : {}" + str);
      list = new ArrayList();
    }
    return list;
  }
}
