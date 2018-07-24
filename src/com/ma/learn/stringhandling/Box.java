package com.ma.learn.stringhandling;

public class Box {
  double width;
  double height;
  double depth;

  Box(double w, double h, double d){
    width = w;
    height = h;
    depth = d;
  }

  @Override
  public String toString() {
    return "Dimensions are " + width + " by " +
           depth + " by " + height + ".";
  }
}
