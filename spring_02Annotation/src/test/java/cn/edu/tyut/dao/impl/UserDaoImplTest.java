package cn.edu.tyut.dao.impl;

import cn.edu.tyut.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author 羊羊
 * @ClassName UserDaoImplTest
 * @SubmitTime 周一
 * @DATE 2023/11/20
 * @Time 16:35
 * @Package_Name cn.edu.tyut.dao.impl
 */
class UserDaoImplTest {

    @Test
    void save() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);
        AbstractApplicationContext abstractApplicationContext = (AbstractApplicationContext) applicationContext;
        abstractApplicationContext.close();
    }
}