/**
 * Copyright ©2014-2018 Youzan.com All rights reserved
 * com.ma.learn.leetcode
 */
package com.ma.learn.leetcode;

import java.util.Arrays;

/**
 * TOPK 问题
 * @author maxiaogang
 * @date 2018/9/21 09:16
 */
public class KthLargest {

    int[] largerNums;
    boolean hasLastEle = false;

    public KthLargest(int k, int[] nums){
        largerNums = new int[k];
        int[] temp = nums;
        Arrays.sort(temp);
        for (int i=0; i < k-1; i++) {
            largerNums[i] = temp[temp.length -i -1];
        }
        //如果nums中包含最后一个元素
        if (k <= nums.length){
            //给最后一个元素赋值
            hasLastEle = true;
            largerNums[k -1] = temp[temp.length -k];
        }
    }

    /**
     * add a elements and return the k largest length
     * @param val
     * @return
     */
    public int add(int val){
        boolean move = false;

        for (int i =0; i< largerNums.length; i ++){
            if (largerNums[i] < val){
                move(val, i);
                move = true;
                break;
            }
        }

        if (move) {
            hasLastEle = true;
        }

        if (!move && !hasLastEle){
            largerNums[largerNums.length -1] = val;
            hasLastEle = true;
        }


        //返回最后一个元素
        int min = largerNums[largerNums.length -1];
        System.out.println(min);
        return min;
    }

    void move(int val, int index){
        System.arraycopy(largerNums, index, largerNums, index + 1, largerNums.length - 1 - index);
        largerNums[index] = val;
    }

    // public static void main(String[] args) {
    //     int k = 3;
    //     int[] arr = {5,-1};
    //     KthLargest kthLargest = new KthLargest(k, arr);
    //     kthLargest.add(2);   // returns 4
    //     kthLargest.add(1);   // returns 5
    //     kthLargest.add(-1);  // returns 5
    //     kthLargest.add(3);   // returns 8
    //     kthLargest.add(4);   // returns 8
    // }

}
