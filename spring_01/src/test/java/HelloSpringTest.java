import cn.edu.tyut.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author 羊羊
 * @ClassName HelloSpringTest
 * @SubmitTime 周日
 * @DATE 2023/11/19
 * @Time 11:10
 * @Package_Name PACKAGE_NAME
 */
class HelloSpringTest {

    @Test
    void show() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-Student.xml");
        Student student01 = applicationContext.getBean("student01", Student.class);
//        HelloSpring helloSpring1 = (HelloSpring) applicationContext.getBean("helloSpring")
        student01.hello();
//        helloSpring1.show();
    }
}