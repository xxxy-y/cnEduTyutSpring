package cn.edu.tyut.entity;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author 羊羊
 * @ClassName MainStudentTest
 * @SubmitTime 周日
 * @DATE 2023/12/24
 * @Time 19:33
 * @Package_Name cn.edu.tyut.entity
 */
class MainStudentTest {

    @Test
    void setTeacher() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationTest.xml");
        MainStudent mainStudent = applicationContext.getBean("mainStudent", MainStudent.class);
        System.out.println(mainStudent);
    }
}