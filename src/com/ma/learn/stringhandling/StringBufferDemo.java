package com.ma.learn.stringhandling;

public class StringBufferDemo {

  public static void main(String[] args) {
    StringBuffer buffer = new StringBuffer("12345678901234567890");
    System.out.println("buffer = " + buffer);
    System.out.println("buffer.capacity() = " + buffer.capacity());
    System.out.println("buffer.length() = " + buffer.length());
    buffer.ensureCapacity(16);
    System.out.println("after ensureCapacity(16) buffer = " + buffer);
    System.out.println("after ensureCapacity(16) buffer.capacity() = " + buffer.capacity());
    System.out.println("after ensureCapacity(16) buffer.length() = " + buffer.length());

    buffer.ensureCapacity(20);
    System.out.println("after ensureCapacity(20) buffer = " + buffer);
    System.out.println("after ensureCapacity(20) buffer.capacity() = " + buffer.capacity());
    System.out.println("after ensureCapacity(20) buffer.length() = " + buffer.length());
  }

}
