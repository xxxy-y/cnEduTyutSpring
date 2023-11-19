package cn.edu.tyut.service.impl;

import cn.edu.tyut.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author 羊羊
 * @ClassName UserServiceImplTest
 * @SubmitTime 周日
 * @DATE 2023/11/19
 * @Time 11:55
 * @Package_Name cn.edu.tyut.service.impl
 */
class UserServiceImplTest {
    @Test
    void login() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userServiceImpl = (UserService) applicationContext.getBean("userService");
        UserService userService = applicationContext.getBean(UserService.class);
        userService.login("1", "2");
        userServiceImpl.login("张三", "123456");
    }
}