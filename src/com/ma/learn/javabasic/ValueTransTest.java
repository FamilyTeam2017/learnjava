package com.ma.learn.javabasic;

/**
 * 验证java入参是值传递
 * 验证步骤:
 * 1.设置初始age = 1;
 * 2.执行 updateOriginAge(),观察age;
 * 3.执行 updateNotOriginAge(),观察age;
 * 预期结果:
 * 1.初始age = 1;
 * 2.执行 updateOriginAge() 后,updateOriginAge()方法打印 age=2,主线程打印 age=2;
 * 3.执行 updateNotOriginAge() 后, updateNotOriginAge()方法打印 age=3, 主线程打印 age=3;
 * 执行结果:
 * 与预期结果一致
 *
 * 结论:
 * java入参是值传递.
 *
 */
public class ValueTransTest {

  public static void main(String[] args) {
    Age age = new Age();
    age.setAge(1);
    System.out.println("main thread age = " + age.getAge());
    updateOriginAge(age);
    System.out.println("main thread age = " + age.getAge());
    updateNotOriginAge(age);
    System.out.println("main thread age = " + age.getAge());
  }

  /**
   * 更新原始的age对象的值
   *
   * @param age
   */
  private static void updateOriginAge(Age age){
    age.setAge(2);
    System.out.println("update origin age, age = " + age.getAge());
  }

  /**
   * 此次更新原始对象的值不会改变
   *
   * @param age
   */
  private static void updateNotOriginAge(Age age){
    age = new Age();
    age.setAge(3);
    System.out.println("update another age, age = " + age.getAge());
  }

}

class Age {
  private int age = 0;

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
