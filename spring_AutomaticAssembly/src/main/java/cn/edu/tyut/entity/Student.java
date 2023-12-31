package cn.edu.tyut.entity;

import lombok.Data;

/**
 * @Author 羊羊
 * @ClassName Student
 * @SubmitTime 周日
 * @DATE 2023/11/19
 * @Time 16:53
 * @Package_Name cn.edu.tyut.entity
 */
@Data
public class Student {
    private Teacher teacher;

    public Student() {
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}