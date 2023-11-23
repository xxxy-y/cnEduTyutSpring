package dao.impl;

import dao.StudentDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author 羊羊
 * @ClassName StudentDaoImplTest
 * @SubmitTime 周四
 * @DATE 2023/11/23
 * @Time 16:15
 * @Package_Name dao.impl
 */
class StudentDaoImplTest {
    @Test
    void addStudent() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDao student = applicationContext.getBean("studentDao", StudentDao.class);
        student.addStudent();
//        student.deleteStudent();
    }
}