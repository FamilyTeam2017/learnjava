package com.ma.learn.stringhandling;

public class StringBufferInsertMock {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("I JAVA");
        System.out.println("INIT STRINGBUFFER IS :" + sb.toString());//INIT STRINGBUFFER IS :I JAVA
        sb.insert(2, "LOVE ");
        System.out.println("AFTER INSERT sb.insert(2, \"LOVE \") is " + sb.toString());//AFTER INSERT sb.insert(2, "LOVE ") is I LOVE JAVA
        sb.insert(2, 43);
        System.out.println("AFTER INSERT sb.insert(2, 43) is " + sb.toString());//AFTER INSERT sb.insert(2, 43) is I 43LOVE JAVA
        sb.insert(2, new Data());
        System.out.println("AFTER INSERT sb.insert(2, new Data()) is " + sb.toString());//AFTER INSERT sb.insert(2, new Data()) is I com.ma.learn.stringhandling.StringBufferInsertMock$Data@3c679bde43LOVE JAVA
        sb.insert(2, new Data2());
        System.out.println("AFTER INSERT sb.insert(2, new Data2()) is " + sb.toString());//AFTER INSERT sb.insert(2, new Data2()) is I {"is":1, "s":2}com.ma.learn.stringhandling.StringBufferInsertMock$Data@3c679bde43LOVE JAVA
    }

    static class Data {
        int id = 0;

        String str = "1";
    }

    static class Data2 {
        int id = 1;

        String s = "2";

        @Override
        public String toString(){
            return "{\"is\":" + id + ", \"s\":" + s+ "}";
        }
    }
}