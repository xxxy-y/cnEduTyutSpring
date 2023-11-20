package cn.edu.tyut.entity;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author 羊羊
 * @ClassName RtTest
 * @SubmitTime 周一
 * @DATE 2023/11/20
 * @Time 17:29
 * @Package_Name cn.edu.tyut.entity
 */
class RtTest {

    @Test
    void setArtTeacher() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-Rt.xml");
        Rt rt = applicationContext.getBean("rt", Rt.class);
        System.out.println(rt);
    }
}