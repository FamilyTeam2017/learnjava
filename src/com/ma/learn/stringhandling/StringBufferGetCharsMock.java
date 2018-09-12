package com.ma.learn.stringhandling;

public class StringBufferGetCharsMock {


    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello world");
        char[] target = "test123123123".toCharArray();
        System.out.println("target before is : " + new String(target));//target before is : test123123123
        sb.getChars(5, sb.length(), target, 4);
        System.out.println("target after is : " + new String(target));//target after is : test world123
    }
}
