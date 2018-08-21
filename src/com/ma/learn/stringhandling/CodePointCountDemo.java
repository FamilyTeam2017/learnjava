package com.ma.learn.stringhandling;

public class CodePointCountDemo {

  public static void main(String[] args) {
    String s = "/uD835/uDD6B";
    System.out.println(s + " code point count is " + s.codePointCount(0, s.length()));
  }

}
