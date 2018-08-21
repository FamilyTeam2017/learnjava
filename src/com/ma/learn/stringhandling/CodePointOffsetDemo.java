package com.ma.learn.stringhandling;

public class CodePointOffsetDemo {

    public static void main(String[] args) {
        //忽略,咱不研究这块,有麻烦又恶心,用处又不打
        String a = "acb";
        System.out.println("a.offsetByCodePoints(0,1) is " + a.offsetByCodePoints(2, 1));
        System.out.println("b.offsetByCodePoints(0,1) is " + a.codePointAt(2));
    }
}
