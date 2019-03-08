package com.ma.learn.javabasic;

public class GetCharsDemo {

    public static void main(String[] args) {
        String s = "This is a demo of the getChars method.";
        int start = 10;
        int end = 14;
        char buf[] = new char[s.length()];
        s.getChars(start, end, buf, 0);
        System.out.println(buf);// print 'demo'
        s.getChars(end, end + 5, buf, 4);
        System.out.println(buf);//print 'demo of t'
    }
}
