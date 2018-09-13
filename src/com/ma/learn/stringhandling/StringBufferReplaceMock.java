package com.ma.learn.stringhandling;

public class StringBufferReplaceMock {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("this is a test");
        System.out.println("before sb is: " + sb.toString());//before sb is: this is a test
        sb.replace(5, 7, "was");
        System.out.println("after sb.replace(5, 7, \"was\") : " + sb.toString());//after sb.replace(5, 7, "was") : this was a test
    }
}
