package com.ma.learn.stringhandling;

/**
 * buffer = 123456789
 * buffer.length() = 9
 * after buffer.setLength(5) = 12345
 * after buffer.length() = 5
 */
public class StringBufferSetLengthDemo {

  public static void main(String[] args) {
    StringBuffer buffer = new StringBuffer("123456789");
    System.out.println("buffer = " + buffer);
    System.out.println("buffer.length() = " + buffer.length());
    buffer.setLength(5);
    System.out.println("after buffer.setLength(5) = " + buffer);
    System.out.println("after buffer.length() = " + buffer.length());
  }

}
