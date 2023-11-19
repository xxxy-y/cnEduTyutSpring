package cn.edu.tyut.entity;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author 羊羊
 * @ClassName TeacherTest
 * @SubmitTime 周日
 * @DATE 2023/11/19
 * @Time 16:15
 * @Package_Name cn.edu.tyut.entity
 */
class TeacherTest {

    @Test
    void testToString() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-Teacher.xml");
        Teacher teacher = applicationContext.getBean("teacher", Teacher.class);
        Teacher1 teacher1 = applicationContext.getBean("teacherList", Teacher1.class);
        Teacher2 teacher2 = applicationContext.getBean("teacherMap", Teacher2.class);
        System.out.println(teacher);
        System.out.println(teacher1);
        System.out.println(teacher2);
    }
}