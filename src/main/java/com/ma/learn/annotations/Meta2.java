package com.ma.learn.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@What(description = "An annotation test class.")
@MyAnno(str = "Meta2", val = 99)
public class Meta2 {

  @What(description = "An annotation test method.")
  @MyAnno(str = "Testing", val = 100)
  public static void myMeth(){
    Meta2 ob = new Meta2();
    Annotation annos[] = ob.getClass().getAnnotations();
    System.out.println("All annotations for Meta2:");
    for (Annotation a:annos){
      System.out.println(a);
    }
    System.out.println();
    try {
      Method m = ob.getClass().getMethod("myMeth");
    }catch (NoSuchMethodException e){
      System.out.println("NO SUCH METHOD myMeth");
    }

  }

  public static void main(String[] args) {
    myMeth();
  }
}
