package com.ma.learn.stringhandling;

/**
 * Alpha-Beta-Gama
 * John,!ID#: 569,!E-mail: John@HerbSchildt.com
 */
public class StringJoinDemo {

    public static void main(String[] args) {
        String result = String.join("-", "Alpha", "Beta", "Gama");
        System.out.println(result);

        result = String.join(",!", "John", "ID#: 569", "E-mail: John@HerbSchildt.com");
        System.out.println(result);
    }
}
