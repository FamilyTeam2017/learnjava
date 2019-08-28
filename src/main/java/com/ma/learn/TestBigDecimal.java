package com.ma.learn;

import java.math.BigDecimal;

public class TestBigDecimal {

    public static void main(String[] args) {
        System.out.println(new BigDecimal(100000).compareTo(new BigDecimal("null")));
    }
}
