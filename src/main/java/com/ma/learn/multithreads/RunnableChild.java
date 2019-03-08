package com.ma.learn.multithreads;

public class RunnableChild implements Runnable {

    Thread t;

    public RunnableChild(){
        t = new Thread(this,"runnable impl thread.");
        System.out.println("Child Thread: " + t);
    }

    @Override
    public void run() {
        try{
            for (int i = 5; i > 0; i--) {
                System.out.println("Child thread:" + i);
                Thread.sleep(500l);
            }
        } catch (InterruptedException e){
            System.out.println("Child thread interrupted.thread :" + t);
        }
        System.out.println("Existing Child Thread.");
    }
}
