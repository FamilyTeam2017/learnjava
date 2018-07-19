package com.ma.learn.generics;

public class Gen<T> {
 T ob;

 Gen(T pram){
   ob = pram;
 }

 //return object
 T getObject(){
   return ob;
 }

 //show type of T
 void showType(){
   System.out.println("Type of T is " + ob.getClass().getName());
 }

}
