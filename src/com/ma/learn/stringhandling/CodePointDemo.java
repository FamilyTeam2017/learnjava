package com.ma.learn.stringhandling;

public class CodePointDemo {
    public static void main(String[] args) {
        String s = "abcdefgHig";
        System.out.println("code point at 1 is : " + s.codePointAt(1));

        for (int i = 0; i < s.length(); i++) {
            System.out.println(Character.codePointAt(s.toCharArray(), i));
        }
    }
}
