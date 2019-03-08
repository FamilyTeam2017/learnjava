package com.ma.learn.stringhandling;

public class StringConstructs {

  public static void main(String[] args) {
    String s = new String();
    System.out.println("str s: " +s);
    char chars[] = {'a', 'b', 'c'};
    String s1 = new String(chars);
    System.out.println("str1 s1: " + s1);
    char chars1[] = {'a', 'b','c','d','e','f'};
    String s2 = new String(chars1, 2, 3);
    System.out.println("str2 s2: " + s2);

    byte ascli[] = {65, 66, 67, 68, 69, 70};
    String s3 = new String(ascli);
    System.out.println("str3 s3: " + s3);
    String s4 = new String(ascli, 2, 3);
    System.out.println("str4 s4: " + s4);
  }
}
