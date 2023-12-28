package cn.edu.tyut.entity;

/**
 * @Author 羊羊
 * @ClassName Student
 * @SubmitTime 周日
 * @DATE 2023/11/19
 * @Time 14:56
 * @Package_Name cn.edu.tyut.entity
 */
public class Student {
    public Student() {
        System.out.println("无参构造方法被调用了");
    }

    public void hello() {
        System.out.println("Hello World!");
    }

    public void init() {
        System.out.println("init");
    }

    public void destroy() {
        System.out.println("destroy");
    }
}
