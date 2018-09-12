package com.ma.learn.stringhandling;

public class StringBufferReverseMock {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("123cba");
        System.out.println("BEFORE sb is " + sb.toString());//BEFORE sb is 123cba
        sb.reverse();
        System.out.println("AFTER sb.reverse() sb is " + sb.toString());//AFTER sb.reverse() sb is abc321
    }

}
