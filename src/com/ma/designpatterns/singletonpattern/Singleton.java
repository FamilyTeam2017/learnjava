package com.ma.designpatterns.singletonpattern;

/**
 * 最简单的单例模式
 * 饿汉式单例模式
 * 优点：线程安全
 * 缺点：程序启动加载类时就会初始化，浪费系统空间；
 */
public final class Singleton {

    private static final Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }
}
