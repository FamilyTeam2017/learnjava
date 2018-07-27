package com.ma.learn.javabasic;

public class RegionMatchesDemo {
    public static void main(String[] args) {
        String str = "hello12345hello";
        boolean result = str.regionMatches(5, "123456", 0, 5);
        System.out.println("Compared with 12345 result is : " + result);
        result = str.regionMatches(5, "123456", 0, 6);
        System.out.println("Compared with 123456 result is : " + result);
    }
}
