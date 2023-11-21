import cn.edu.tyut.config.ConfigurationComponent;
import cn.edu.tyut.entity.StudentComponent;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author 羊羊
 * @ClassName iuw
 * @SubmitTime 周二
 * @DATE 2023/11/21
 * @Time 11:55
 * @Package_Name PACKAGE_NAME
 */
public class iuw {
    @Test
    public void sudsy() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationComponent.class);
        StudentComponent studentComponent = applicationContext.getBean("studentComponent", StudentComponent.class);
        System.out.println(studentComponent);
    }
}