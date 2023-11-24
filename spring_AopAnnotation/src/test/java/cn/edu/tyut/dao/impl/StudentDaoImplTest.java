package cn.edu.tyut.dao.impl;

import cn.edu.tyut.config.MainConfiguration;
import cn.edu.tyut.dao.StudentDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author 羊羊
 * @ClassName StudentDaoImplTest
 * @SubmitTime 周五
 * @DATE 2023/11/24
 * @Time 22:17
 * @Package_Name cn.edu.tyut.dao.impl
 */
class StudentDaoImplTest {

    @Test
    void addStudent() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfiguration.class);
        StudentDao studentDao = applicationContext.getBean("studentDaoImpl", StudentDao.class);
        studentDao.addStudent();
    }

    @Test
    void deleteStudent() {
    }
}