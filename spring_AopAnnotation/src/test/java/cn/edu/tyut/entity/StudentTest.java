package cn.edu.tyut.entity;

import cn.edu.tyut.config.MainConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author 羊羊
 * @ClassName StudentTest
 * @SubmitTime 周五
 * @DATE 2023/11/24
 * @Time 22:16
 * @Package_Name cn.edu.tyut.entity
 */
class StudentTest {

    @Test
    void say() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfiguration.class);
        Student student = applicationContext.getBean("student", Student.class);
        student.say();
    }
}