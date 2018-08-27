package com.ma.learn;

import java.io.File;

public class LearnFile {

  public static void main(String[] args) {
    File file = new File("readme.txt");
    System.out.println(new File(".").getAbsolutePath());
    System.out.println(file.exists());
  }

}
