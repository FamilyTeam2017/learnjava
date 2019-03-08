package com.ma.learn;

public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        //从0开始+,加到1001,sum = sum + 0;没有意义,多了一次运算,所以直接从1开始加就好了
//    	for(int i=0;i<1001;i++){
        for (int i = 1; i < 1001; i++) {
//    		此行缺少分号
//    		sum=sum+i
            sum = sum + i;
        }
//    	此行带单引号的是字符,类型为char,所以'sum'存在语法错误
//		输出变量的话直接写变量名称就可以了;
//        System.out.println('sum');
        System.out.println(sum);
    }
}
