package cn.edu.tyut.entity;

import lombok.Data;
import lombok.ToString;

/**
 * @Author 羊羊
 * @ClassName Teacher
 * @SubmitTime 周日
 * @DATE 2023/11/19
 * @Time 16:11
 * @Package_Name cn.edu.tyut.entity
 */
@ToString
public class Teacher {
    private String name;
    private Integer age;

    public Teacher(String name) {
        System.out.println("1");
        this.name = name;
    }

    public Teacher(Integer name) {
        System.out.println("2");
        this.age = name;
    }
}
