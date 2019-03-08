package com.ma.learn.stringhandling;

public class StringBufferMock {

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println("capacity of new StringBuffer() : " + stringBuffer.capacity());
        System.out.println("length of new StringBuffer() : " + stringBuffer.length());
        stringBuffer = new StringBuffer(6);
        System.out.println("capacity of new StringBuffer(6) : " + stringBuffer.capacity());
        System.out.println("length of new StringBuffer(6) : " + stringBuffer.length());
        stringBuffer = new StringBuffer("abc");
        System.out.println("capacity of new StringBuffer(\"abc\") : " + stringBuffer.capacity());//"abc".length() + 16
        System.out.println("length of new StringBuffer(\"abc\") : " + stringBuffer.length());//"abc".length()
        stringBuffer.ensureCapacity(10);
        System.out.println();
        System.out.println("ensureCapacity(10) of new StringBuffer(\"abc\") : " + stringBuffer.capacity());//"abc".length() + 16
        System.out.println("ensureCapacity(10) of new StringBuffer(\"abc\") : " + stringBuffer.length());//"abc".length()
        stringBuffer.ensureCapacity(20);
        System.out.println();
        System.out.println("ensureCapacity(20) of new StringBuffer(\"abc\") : " + stringBuffer.capacity());//"abc".length() + 16
        System.out.println("ensureCapacity(20) of new StringBuffer(\"abc\") : " + stringBuffer.length());//"abc".length()
    }
}
