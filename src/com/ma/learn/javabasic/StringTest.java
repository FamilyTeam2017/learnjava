package com.ma.learn.javabasic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StringTest {

  public static void main(String[] args) {
    List<String> strs = new ArrayList<>();
    strs.add("2018-03-29");
    strs.add("2018-03-27");
    strs.add("2018-03-28");
    strs.sort(Comparator.reverseOrder());
    strs.forEach(System.out::println);
  }
}
