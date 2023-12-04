package cn.edu.tyut.service.impl;

import cn.edu.tyut.config.MainConfiguration;
import cn.edu.tyut.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author 羊羊
 * @ClassName StudentServiceImplTest
 * @SubmitTime 周一
 * @DATE 2023/12/4
 * @Time 19:56
 * @Package_Name cn.edu.tyut.service.impl
 */
class StudentServiceImplTest {

    @Test
    void test1() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfiguration.class);
        StudentService studentService = applicationContext.getBean("studentServiceImpl", StudentService.class);
        studentService.test();
    }
}