/**
 * Copyright ©2014-2018 Youzan.com All rights reserved
 * com.ma.learn.leetcode
 */
package com.ma.learn.leetcode;

/**
 * @author maxiaogang
 * @date 2018/9/26 09:29
 */
public class Solution {

    int eleIndex = 0;
    int countIndex = 0;
    public int compress(char[] chars) {
        char[] elements = new char[chars.length];
        int[] counts = new int[chars.length];
        eleIndex = 0;
        countIndex = 0;
        addEle(chars[0], elements);
        int eleCount = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                eleCount++;
            } else {
                addCount(eleCount, counts);
                addEle(chars[i], elements);
                eleCount = 1;
            }
        }
        if (eleCount > 1){
            addCount(eleCount, counts);
        }

        return buildResult(elements, counts, chars);
    }

    private void addEle(char c, char[] elements) {
        elements[eleIndex] = c;
        eleIndex++;
    }

    private void addCount(int count, int[] counts) {
        counts[countIndex] = count;
        countIndex++;
    }

    private int buildResult(char[] elements,int[] counts, char[] chars) {
        int resultIndex = 0;
        for (int i = 0; i < eleIndex; i++) {
            chars[resultIndex] = elements[i];
            resultIndex++;
            if (counts[i] > 1) {
                if (counts[i] <10){
                    chars[resultIndex] = String.valueOf(counts[i]).toCharArray()[0];
                    resultIndex++;
                } else {
                    String cStr = Integer.toString(counts[i]);
                    for (char c : cStr.toCharArray()) {
                        chars[resultIndex] = c;
                        resultIndex++;
                    }
                }
            }
        }
        return resultIndex;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] chars = {'a','a'};
        System.out.println(solution.compress(chars));
    }

}
