package com.ma.learn.multithreads.priority.demo2;

import java.util.Comparator;

public class ThreadPriorityComparator implements Comparator<Thread> {

    @Override
    public int compare(Thread o1, Thread o2) {
        return o1.getPriority() - o2.getPriority();
    }
}
