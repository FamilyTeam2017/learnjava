package com.ma.learn.generics;

public class GenDemo {

  public static void main(String[] args) {
    Gen<Integer> integerObject;
    integerObject = new Gen<>(3);

    integerObject.showType();

    int v = integerObject.getObject();
    System.out.println("value: " + v);
    System.out.println();

    Gen<String> strObject = new Gen<>("hello");
    strObject.showType();

    System.out.println("value: " + strObject.getObject());
  }

}
