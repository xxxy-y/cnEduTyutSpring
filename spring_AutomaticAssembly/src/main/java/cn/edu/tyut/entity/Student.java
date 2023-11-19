package cn.edu.tyut.entity;

import lombok.Data;
import lombok.Getter;

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
    public Student(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setArtTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}