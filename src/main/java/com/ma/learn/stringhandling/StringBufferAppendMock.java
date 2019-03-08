package com.ma.learn.stringhandling;

public class StringBufferAppendMock {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");
        System.out.println("INIT STRINGBUFFER IS :" + sb.toString());//INIT STRINGBUFFER IS :hello
        sb.append(" WORLD");
        System.out.println("AFTER APPEND sb.append(\" WORLD\") is " + sb.toString());//AFTER APPEND sb.append(" WORLD") is hello WORLD
        sb.append(43);
        System.out.println("AFTER APPEND sb.append(43) is " + sb.toString());//AFTER APPEND sb.append(43) is hello WORLD43
        sb.append(new Data());
        System.out.println("AFTER APPEND sb.append(new Data()) is " + sb.toString());//AFTER APPEND sb.append(new Data()) is hello WORLD43com.ma.learn.stringhandling.StringBufferAppendMock$Data@3c679bde
        sb.append(new Data2());
        System.out.println("AFTER APPEND sb.append(new Data2()) is " + sb.toString());//AFTER APPEND sb.append(new Data2()) is hello WORLD43com.ma.learn.stringhandling.StringBufferAppendMock$Data@3c679bde{"is":1, "s":2}
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
