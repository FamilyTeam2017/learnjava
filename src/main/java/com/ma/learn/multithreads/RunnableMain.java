package com.ma.learn.multithreads;

public class RunnableMain {
    public static void main(String[] args) {
        RunnableChild runnableChild = new RunnableChild();
        runnableChild.t.start();

        try{
            for (int i = 5; i > 0; i--) {
                System.out.println("MAIN thread:" + i);
                Thread.sleep(2);
            }
        } catch (InterruptedException e){
            System.out.println("MAIN thread interrupted.thread :" + runnableChild.t);
        }
        System.out.println("Exiting MAIN Thread.");

    }
}
