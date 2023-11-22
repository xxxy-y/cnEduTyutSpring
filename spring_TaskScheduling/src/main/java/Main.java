import cn.edu.tyut.config.MainConfiguration;
import cn.edu.tyut.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author 羊羊
 * @ClassName Main
 * @SubmitTime 周三
 * @DATE 2023/11/22
 * @Time 9:45
 * @Package_Name PACKAGE_NAME
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfiguration.class);
        Student student = applicationContext.getBean("student", Student.class);
        applicationContext.close();
    }
}
