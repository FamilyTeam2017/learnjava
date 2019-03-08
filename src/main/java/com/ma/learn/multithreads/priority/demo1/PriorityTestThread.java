package com.ma.learn.multithreads.priority.demo1;

public class PriorityTestThread extends Thread{

    public PriorityTestThread(String name) {
        super(name);
    }

    @Override
    public void run(){
        System.out.println("thread " + this.getName() + " running.");
    }
}
