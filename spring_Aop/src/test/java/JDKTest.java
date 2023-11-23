import aspect.MyAspect;
import dao.UserDao;
import dao.impl.UserDaoImpl;
import org.junit.jupiter.api.Test;
import proxy.MyProxy;

/**
 * @Author 羊羊
 * @ClassName JDKTest
 * @SubmitTime 周四
 * @DATE 2023/11/23
 * @Time 15:09
 * @Package_Name PACKAGE_NAME
 */
public class JDKTest {
    @Test
    void test() {
        MyProxy jdkProxy = new MyProxy();
        UserDao userDao = new UserDaoImpl();
        UserDao userDao1 = (UserDao) jdkProxy.createProxy(userDao);
        userDao1.addUser();
        userDao1.deleteUser();
    }
}
