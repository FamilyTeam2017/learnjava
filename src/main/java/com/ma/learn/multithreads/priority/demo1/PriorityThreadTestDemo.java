package com.ma.learn.multithreads.priority.demo1;

public class PriorityThreadTestDemo {

    public static void main(String[] args) {
        PriorityTestThread thread1 = new PriorityTestThread("Thread1");
        PriorityTestThread thread2 = new PriorityTestThread("Thread2");
        thread1.setPriority(5);
        thread2.setPriority(9);
        thread1.start();
        thread2.start();
    }
}
