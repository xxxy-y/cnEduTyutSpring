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
