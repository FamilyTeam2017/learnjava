package com.ma.learn.stringhandling;

public class MatchesDemo {

  public static void main(String[] args) {
    String s = "abcdef";
    System.out.println(s + "matches ^a.* result in " + s.matches("^a.*"));
  }
}
