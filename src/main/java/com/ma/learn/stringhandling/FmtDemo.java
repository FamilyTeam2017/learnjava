package com.ma.learn.stringhandling;

import java.util.Date;

public class FmtDemo {

  public static void main(String[] args) {
    //字符串类型
    System.out.println(String.format("字符串类型格式化: %s", 1234.4f));
    System.out.println(String.format("字符串类型格式化: %f", 1234.4f));
    System.out.println(String.format("字符类型格式化: %c", 'A'));

    //时间类型
    Date now = new Date();
    System.out.println(String.format("日期格式年-月-日: %tF", now));
    System.out.println(String.format("日期格式月/日/年: %tD", now));
    System.out.println(String.format("日期格式完整日期: %tc", now));
    System.out.println(String.format("12小时制HH:MM:SS PM: %tr", now));
    System.out.println(String.format("24小时制HH:MM:SS: %tT", now));
    System.out.println(String.format("24小时制HH:MM:%tZ %tR", now, now));
  }
}
