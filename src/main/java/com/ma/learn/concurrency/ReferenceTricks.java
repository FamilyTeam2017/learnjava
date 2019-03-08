package com.ma.learn.concurrency;

public class ReferenceTricks {

  public static void main(String[] args) {
    ReferenceTricks r = new ReferenceTricks();
    r.i = 0;
    System.out.println("Before changeInteger i=" + r.i);//预计打印0
    changeInteger(r);//预计打印10
    System.out.println("After changeInteger i=" + r.i);//预计打印10

    System.out.println();

    r.i = 0;
    System.out.println("Before changeInteger i=" + r.i);//预计打印0
    changeReference(r);//预计打印15
    System.out.println("After changeInteger i=" + r.i);//预计打印0

    System.out.println();


  }

  private static void changeInteger(ReferenceTricks tricks){
    tricks.i = 10;
    System.out.println("in changeInteger r.i=" + tricks.i);
  }

  private static void changeReference(ReferenceTricks tricks){
    tricks = new ReferenceTricks();
    tricks.i = 15;
    System.out.println("in changeReference r.i=" + tricks.i);
  }


  public int i;

}
