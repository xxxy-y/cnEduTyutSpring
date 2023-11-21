package cn.edu.tyut.entity;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author 羊羊
 * @ClassName Bean4Test
 * @SubmitTime 周二
 * @DATE 2023/11/21
 * @Time 10:35
 * @Package_Name cn.edu.tyut.entity
 */
class Bean4Test {
    @Test
    void s() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextText.xml");
        Bean4 bean4 = applicationContext.getBean("bean4Factory", Bean4.class);
        Bean4Factory bean4Factory = applicationContext.getBean("&bean4Factory", Bean4Factory.class);
        System.out.println(bean4 + " " + bean4Factory);
    }
}