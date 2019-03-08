package com.ma.learn.concurrency;

/**
 * 主线程逻辑:
 * 1.定义volatile变量asleep=false;
 * 2.线程 VolatileTestAfterSleepTask 加载asleep;
 * 3.线程 VolatileTestAwakeTask 对asleep变量进行修改
 * 4.查看主线程的asleep
 * 5.将主线程的asleep设置为true;查看VolatileTestAfterSleepTask线程状态;
 * 执行结果:
 * 1）执行完第3步后,VolatileTestAwakeTask线程执行完成;
 * VolatileTestAfterSleepTask中的sleep 仍然为false, 线程继续执行;
 * 2）第4步sleep为false;
 * 3) 第5步sleep为true,但是VolatileTestAfterSleepTask中的sleep, 线程继续执行。
 *
 * 结果分析：
 * 第1步: 主线程的sleep指向了false;
 * 第2步: VolatileTestAfterSleepTask 中的变量sleep指向了false;
 * 第3步: VolatileTestAwakeTask 中的变量sleep指向了主线程的sleep变量内存地址;
 *        对 VolatileTestAwakeTask 中的sleep进行修改后,指向了true;原先的主线程的sleep不会有变动;
 * 第4步: 无变动;
 * 第5步: 主线程的sleep指向了true,但是 VolatileTestAfterSleepTask 的sleep仍然指向false;
 *
 * 结论：
 *  需要通过内存来分析线程可见性;java入参是值传递,需要注意;
 *
 */
public class VolatileTest {

  volatile static Boolean sleep = false;

  public static void main(String[] args) throws InterruptedException {
    new VolatileTestAfterSleepTask(sleep).start();
    System.out.println("------");
    new VolatileTestAwakeTask(sleep).start();
    int i =0;
    while (i<5) {
      System.out.println("sleep?" + sleep);
      Thread.sleep(1000l);
      i++;
    }
    sleep = true;
    System.out.println("sleep-----" + sleep);

  }
}
