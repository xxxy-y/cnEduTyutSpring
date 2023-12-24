package cn.edu.tyut.entity;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 羊羊
 * @ClassName StudentTest
 * @SubmitTime 周日
 * @DATE 2023/11/19
 * @Time 17:00
 * @Package_Name cn.edu.tyut.entity
 */
class StudentTest {

    @Test
    void setTeacher() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-byType.xml");
        Student bean = applicationContext.getBean("student01", Student.class);
        System.out.println(bean);
    }
    @Test
    void s() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-byName.xml");
        Student bean = applicationContext.getBean("student", Student.class);
        System.out.println(bean);
    }

    @Test
    void ss() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-constructor.xml");
        Student bean = applicationContext.getBean("student", Student.class);
        System.out.println(bean);
    }
}