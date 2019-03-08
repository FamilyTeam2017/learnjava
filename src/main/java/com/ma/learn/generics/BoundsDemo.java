package com.ma.learn.generics;

public class BoundsDemo {

  public static void main(String[] args) {
    Integer inums[] = {1,2,3,4,5};
    Stats<Integer> integerStats = new Stats<>(inums);
    double v = integerStats.average();
    System.out.println("iob average is " + v);

    Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
    Stats<Double> doubleStats = new Stats<>(dnums);
    double value = doubleStats.average();
    System.out.println("double average is " + value);

    System.out.println(integerStats.sameAva(doubleStats));
  }
}
