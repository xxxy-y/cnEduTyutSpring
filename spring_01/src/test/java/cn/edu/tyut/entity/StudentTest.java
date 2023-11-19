package cn.edu.tyut.entity;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author 羊羊
 * @ClassName StudentTest
 * @SubmitTime 周日
 * @DATE 2023/11/19
 * @Time 15:10
 * @Package_Name cn.edu.tyut.entity
 */
class StudentTest {

    @Test
    void hello() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-Student.xml");
        Student student1 = applicationContext.getBean("student", Student.class);
        Student student2 = applicationContext.getBean("student", Student.class);
        SportStudent sStudent = applicationContext.getBean("sStudent", SportStudent.class);
        student1.hello();
        sStudent.hello();
        System.out.println("student1 = " + student1 + "     student2 = " + student2);
        System.out.println("student1 == student2 is " + (student1 == student2));
    }
}