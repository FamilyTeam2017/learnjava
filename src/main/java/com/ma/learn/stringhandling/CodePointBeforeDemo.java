package com.ma.learn.stringhandling;

public class CodePointBeforeDemo {

  public static void main(String[] args) {
    String s = "afit";
    System.out.println(s.charAt(1) + " code point is " + s.codePointAt(1));
    System.out.println(s.charAt(2) + " code point before is " + s.codePointBefore(2));
  }

}
