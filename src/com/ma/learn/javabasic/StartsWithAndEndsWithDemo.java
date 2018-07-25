package com.ma.learn.javabasic;

public class StartsWithAndEndsWithDemo {
    public static void main(String[] args) {
        String hello = "hello123";
        System.out.println(hello + " starts with hello is : " + hello.startsWith("hello"));
        System.out.println(hello + " ends with 123 is : " + hello.endsWith("123"));
    }
}
