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
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloSpring helloSpring = applicationContext.getBean("helloSpring", HelloSpring.class);
        HelloSpring helloSpring1 = (HelloSpring) applicationContext.getBean("helloSpring");
        helloSpring.show();
        helloSpring1.show();
    }
}