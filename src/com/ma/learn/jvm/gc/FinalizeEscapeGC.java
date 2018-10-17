/**
 * Copyright ©2014-2018 Youzan.com All rights reserved
 * com.ma.learn.jvm.gc
 */
package com.ma.learn.jvm.gc;

/**
 *
 * @author maxiaogang
 * @date 2018/10/8 22:58
 */
public class FinalizeEscapeGC {

    public static FinalizeEscapeGC SAVE_HOOK = null;

    public void isAlive(){
        System.out.println("YES, I'AM ALIVE.");
    }

    /**
     * 任何一个对象的finalize方法只会被JVM执行一次.
     * @throws Throwable
     */
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize() METHOD EXECUTED.");
        FinalizeEscapeGC.SAVE_HOOK = this;
    }

    public static void main(String[] args) throws Throwable {
        SAVE_HOOK = new FinalizeEscapeGC();

        SAVE_HOOK = null;
        System.gc();
        Thread.sleep(500);

        if (SAVE_HOOK != null){
            SAVE_HOOK.isAlive();
        } else {
            System.out.println("NO, I'AM DEAD.");
        }

        SAVE_HOOK = null;
        System.gc();
        Thread.sleep(500);

        if (SAVE_HOOK != null){
            SAVE_HOOK.isAlive();
        } else {
            System.out.println("NO, I'AM DEAD.");
        }
    }
}
