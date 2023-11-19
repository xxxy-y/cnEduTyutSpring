import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author 羊羊
 * @ClassName User1Test
 * @SubmitTime 周日
 * @DATE 2023/11/19
 * @Time 11:35
 * @Package_Name PACKAGE_NAME
 */
class User1Test {

    @Test
    void getId() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-User1.xml");
        User1 user1 = applicationContext.getBean("user1", User1.class);
        System.out.println(user1);
    }
}