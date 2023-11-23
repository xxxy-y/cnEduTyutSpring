import dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 羊羊
 * @ClassName UserDaoImpl
 * @SubmitTime 周四
 * @DATE 2023/11/23
 * @Time 15:28
 * @Package_Name PACKAGE_NAME
 */
public class UserDaoImpl {
    @Test
    void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
        userDao.addUser();
    }
}
