package com.ma.learn.stringhandling;

/**
 * Original: This is a test.
 * Uppercase: THIS IS A TEST.
 * Lowercase: this is a test.
 */
public class ChangeCase {
    public static void main(String[] args) {
        String s = "This is a test.";

        System.out.println("Original: " + s);

        String upper = s.toUpperCase();
        String lower = s.toLowerCase();
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
    }
}
