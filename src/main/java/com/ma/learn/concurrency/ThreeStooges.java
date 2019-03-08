package com.ma.learn.concurrency;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashSet;
import java.util.Set;

import jdk.nashorn.internal.ir.annotations.Immutable;

/**
 * 不可变对象
 */
@Immutable
public final class ThreeStooges {

  private final Set<String> stooges = new HashSet<>();

  public ThreeStooges() {
    stooges.add("Moe");
    stooges.add("Larry");
    stooges.add("Curly");
  }

  public Boolean isStooge(String name){
    return stooges.contains(name);
  }
}
