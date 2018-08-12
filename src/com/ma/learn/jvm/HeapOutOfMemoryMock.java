package com.ma.learn.jvm;

import java.util.ArrayList;
import java.util.List;

public class HeapOutOfMemoryMock {

    public static void main(String[] args) {
        List<byte[]> list = new ArrayList<>();
        int i =0;
        boolean flag = true;
        while (flag){
            try {
                i++;
                list.add(new byte[1024*1024]);
            }catch (Throwable e){
                e.printStackTrace();
                flag = false;
                System.out.println("count = " + i);
            }
        }
    }
}
