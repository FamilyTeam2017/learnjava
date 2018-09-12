package com.ma.learn.stringhandling;

public class StringBufferDeleteMock {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("HELLO");
        System.out.println("BEFORE DELETE :" + sb.toString());//BEFORE DELETE :HELLO
        sb.delete(2, 4);
        System.out.println("AFTER sb.delete(2, 3) :" + sb.toString());//AFTER sb.delete(2, 3) :HEO
        sb.deleteCharAt(2);
        System.out.println("AFTER sb.deleteCharAt(1) : " + sb.toString());//AFTER sb.deleteCharAt(1) : HE
    }
}
