import cn.edu.tyut.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 羊羊
 * @ClassName Annotation
 * @SubmitTime 周一
 * @DATE 2023/11/20
 * @Time 17:04
 * @Package_Name PACKAGE_NAME
 */
public class Annotation {
    @Test
    void test() {
        ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController userController = applicationContext.getBean("userController", UserController.class);
        userController.save();
    }
}
