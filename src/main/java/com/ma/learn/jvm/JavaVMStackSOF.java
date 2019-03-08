/**
 * Copyright ©2014-2018 Youzan.com All rights reserved
 * com.ma.learn.jvm
 */
package com.ma.learn.jvm;

/**
 * VM args: -Xss128k
 *
 * @author maxiaogang
 * @date 2018/10/7 21:25
 */
public class JavaVMStackSOF {

    private int stackLength = 1;

    public void stackLeak(){
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args){
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try {
            oom.stackLeak();
        } catch (Throwable e){
            System.out.println("stack length :" + oom.stackLength);
            throw e;
        }
    }
}
