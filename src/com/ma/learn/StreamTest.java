/**
 * Copyright ©2014-2018 Youzan.com All rights reserved
 * com.ma.learn
 */
package com.ma.learn;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 *
 * @author maxiaogang
 * @date 2018/10/10 16:53
 */
public class StreamTest {

    public static void main(String[] args) {
        List<Integer> source = new ArrayList<>();
        for(int i = 0; i < 1000000; i++){
            source.add(i);
        }

        long start = System.currentTimeMillis();
        System.out.println("START paralStream");
        source.parallelStream().map(item -> {
            Num num = new Num(item);
            if (num.num < 50) {
                boolean contains = source.contains(num.num);
                if (contains) {
                    return num.convert();
                }
            }
            return null;
        }).filter(Objects::nonNull).collect(Collectors.toList());
        System.out.println("COST:" + (System.currentTimeMillis() - start));


        start = System.currentTimeMillis();
        System.out.println("START2");
        source.parallelStream().map(Num::new)
                .filter(num -> num != null && num.getNum() < 50)
                .filter(num -> source.contains(num.getNum()))
                .map(Num::convert).collect(Collectors.toList());
        System.out.println("COST3:" + (System.currentTimeMillis() - start));


        List<Num> result = new ArrayList<>();

        start = System.currentTimeMillis();
        System.out.println("START3 AGAIN");
        for (Integer i : source) {
            Num num = new Num(i);
            if (num.num < 50) {
                boolean contains = source.contains(num.num);
                if (contains) {
                    Num convert = num.convert();
                    if (convert != null){
                        result.add(convert);
                    }
                }
            }
        }
        System.out.println("COST2:" + (System.currentTimeMillis() - start));
    }


    static class Num{
        private int num;
        Num(int num){
            // try {
            //     Thread.sleep(1l);
            // } catch (InterruptedException e) {
            //     e.printStackTrace();
            // }
            this.num = num;
        }

        int getNum(){
            return num;
        }

        Num convert(){
            num = num*2;
            return new Num(num);
        }
    }



}
