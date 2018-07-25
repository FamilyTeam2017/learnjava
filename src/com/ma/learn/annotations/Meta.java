package com.ma.learn.annotations;

import java.lang.reflect.Method;

public class Meta {

  @MyAnno(str = "Annotation Example", val = 100)
  public static void myMeth() {
    Meta ob = new Meta();
    try {
      Class<?> c = ob.getClass();

      Method m = c.getMethod("myMeth");
      MyAnno anno = m.getAnnotation(MyAnno.class);
      System.out.println(anno.str() + " " + anno.val());
    } catch (NoSuchMethodException e){
      System.out.println("NO METHOD myMethod.");
    }
  }

  @MyAnno(str = "Two Parameters", val = 19)
  public static void myMeth2(String str, int i){
    Meta ob = new Meta();
    try {
      Class<?> c = ob.getClass();

      Method m = c.getMethod("myMeth2", String.class, int.class);
      MyAnno anno = m.getAnnotation(MyAnno.class);
      System.out.println(anno.str() + " " + anno.val());
    } catch (NoSuchMethodException e){
      System.out.println("NO METHOD myMethod.");
    }
  }

  public static void main(String[] args) {
    myMeth();
    myMeth2("test", 10);
  }

}
