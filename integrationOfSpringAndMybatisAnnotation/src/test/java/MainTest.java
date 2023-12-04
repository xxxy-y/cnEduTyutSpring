import cn.edu.tyut.config.MainConfiguration;
import cn.edu.tyut.service.StudentService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.swing.*;

/**
 * @Author 羊羊
 * @ClassName MainTest
 * @SubmitTime 周一
 * @DATE 2023/12/4
 * @Time 20:14
 * @Package_Name PACKAGE_NAME
 */

/**
 * 当一个测试类使用@ExtendWith(SpringExtension.class)注解时，JUnit在运行该测试类时会使用SpringExtension作为运行器
 * 这将启动Spring容器，并在测试期间加载和管理Bean，以及提供Spring的其他特性，如依赖注入、事务管理等。
 * 因此，通过@ExtendWith(SpringExtension.class)，测试类可以在Spring环境下运行，
 * 可以使用Spring提供的功能和特性进行测试，从而更好地测试Spring应用程序的各个组件的行为和交互。
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = MainConfiguration.class)
public class MainTest {
    private StudentService studentService;

    @Autowired
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @Test
    void mainTest() {
        studentService.test();
    }
}
