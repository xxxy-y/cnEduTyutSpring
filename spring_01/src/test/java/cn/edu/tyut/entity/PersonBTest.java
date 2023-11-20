package cn.edu.tyut.entity;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author 羊羊
 * @ClassName PersonBTest
 * @SubmitTime 周一
 * @DATE 2023/11/20
 * @Time 20:17
 * @Package_Name cn.edu.tyut.entity
 */
class PersonBTest {

    @Test
    void setName() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("app.xml");
        PersonB personB = applicationContext.getBean("personB", PersonB.class);
        System.out.println(personB);
    }
}