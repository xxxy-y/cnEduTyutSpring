package cn.edu.tyut.entity;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author 羊羊
 * @ClassName Bean1Test
 * @SubmitTime 周一
 * @DATE 2023/11/20
 * @Time 15:17
 * @Package_Name cn.edu.tyut.entity
 */
class Bean1Test {
    @Test
    void applicationContext() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean1 bean1 = applicationContext.getBean("bean1", Bean1.class);
        System.out.println(bean1);
    }

    @Test
    void applicationContextStaticFactory() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-staticFactory.xml");
        System.out.println("=============");
        Bean2 bean2 = applicationContext.getBean("bean2Factory", Bean2.class);
        System.out.println(bean2);
    }

    @Test
    void applicationContextExampleFactory() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-exampleFactory.xml");
        System.out.println("=================");
        Bean3 bean3 = applicationContext.getBean("bean3", Bean3.class);
        System.out.println(bean3);
    }
}