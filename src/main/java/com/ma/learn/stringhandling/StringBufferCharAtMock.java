package com.ma.learn.stringhandling;

public class StringBufferCharAtMock {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");
        char e = sb.charAt(1);
        System.out.println("\"hello\".charAt(1) is " + e);
        sb.setCharAt(1, 'i');
        System.out.println("\"hello\".charAt(1) is " + sb.charAt(1));
    }
}
