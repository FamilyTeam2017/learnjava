package com.ma.learn.stringhandling;

public class StringBufferDemo {

  public static void main(String[] args) {
    StringBuffer buffer = new StringBuffer("12345678901234567890");
    System.out.println("buffer = " + buffer);
    System.out.println("buffer.capacity() = " + buffer.capacity());
    System.out.println("buffer.length() = " + buffer.length());
    buffer.ensureCapacity(16);
    System.out.println("buffer = " + buffer);
    System.out.println("buffer.capacity() = " + buffer.capacity());
    System.out.println("buffer.length() = " + buffer.length());

    StringBuffer buffer1 = new StringBuffer("123");
    System.out.println("buffer1 = " + buffer1);
    System.out.println("buffer1.capacity() = " + buffer1.capacity());
    System.out.println("buffer1.length() = " + buffer1.length());
    buffer1.ensureCapacity(20);
    System.out.println("buffer1 = " + buffer1);
    System.out.println("buffer1.capacity() = " + buffer1.capacity());
    System.out.println("buffer1.length() = " + buffer1.length());
  }

}
