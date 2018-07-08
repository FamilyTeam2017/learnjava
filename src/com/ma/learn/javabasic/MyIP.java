package com.ma.learn.javabasic;

public interface MyIP {

  int getNum();

  default String getString() {
    return "Default String";
  }

  static int getDefaultNum(){
    return 10;
  }

}
