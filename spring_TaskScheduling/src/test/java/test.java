import cn.edu.tyut.config.MainConfiguration;
import cn.edu.tyut.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author 羊羊
 * @ClassName test
 * @SubmitTime 周三
 * @DATE 2023/11/22
 * @Time 9:33
 * @Package_Name PACKAGE_NAME
 */
public class test {
    @Test
    void a() throws InterruptedException {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfiguration.class);
        Student student = applicationContext.getBean(Student.class);
        student.asyncTest();
        student.syncTest();
        System.out.println(student.getClass());
    }
}