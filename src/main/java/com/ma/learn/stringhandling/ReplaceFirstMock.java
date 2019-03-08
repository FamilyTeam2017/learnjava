package com.ma.learn.stringhandling;

public class ReplaceFirstMock {
    public static void main(String[] args) {
        String str = "123abcdefaaabcde123";
        System.out.println(str);
        System.out.println(str.replaceFirst("abc.{2}", "-----"));
        System.out.println(str);
        System.out.println(str.replaceAll("abc.{2}", "-----"));
        System.out.println(str);
        for (String s :str.split("abc.{2}")) System.out.println(s);
        System.out.println(str);
        for (String s :str.split("abc.{2}", 2)) System.out.println(s);
        System.out.println(str);
        System.out.println(str.subSequence(3,5));
        System.out.println(str);
    }
}
