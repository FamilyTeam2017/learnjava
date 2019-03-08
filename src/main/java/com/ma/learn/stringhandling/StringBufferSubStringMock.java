package com.ma.learn.stringhandling;

public class StringBufferSubStringMock {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello world!");
        System.out.println("StringBuffer sb is :" + sb.toString());//StringBuffer sb is :hello world!
        System.out.println("sb.subString(6) is:" + sb.substring(6));//sb.subString(6) is:world!
        System.out.println("sb.subString(6, 11) is:" + sb.substring(6, 11));//sb.subString(6, 11) is:world
    }
}
