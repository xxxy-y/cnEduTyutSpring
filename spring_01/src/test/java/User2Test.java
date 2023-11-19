import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author 羊羊
 * @ClassName User2Test
 * @SubmitTime 周日
 * @DATE 2023/11/19
 * @Time 11:43
 * @Package_Name PACKAGE_NAME
 */
class User2Test {

    @Test
    void getId() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-User2.xml");
        User2 user2 = applicationContext.getBean("user2", User2.class);
        System.out.println(user2);
    }
}