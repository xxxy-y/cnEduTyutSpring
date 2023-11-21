package cn.edu.tyut.entity;

/**
 * @Author 羊羊
 * @ClassName Student
 * @SubmitTime 周二
 * @DATE 2023/11/21
 * @Time 11:20
 * @Package_Name cn.edu.tyut.entity
 */
public class Student01 {
    private Teacher teacher;

    public Student01(Teacher teacher) {
        this.teacher = teacher;
    }

    public void init() {
        System.out.println("student init");
    }

    public void destroy() {
        System.out.println("student destroy");
    }
}
