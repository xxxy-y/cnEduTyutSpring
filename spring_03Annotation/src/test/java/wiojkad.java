import cn.edu.tyut.config.MainConfiguration01;
import cn.edu.tyut.entity.ArtTeacher;
import cn.edu.tyut.entity.Student01;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author 羊羊
 * @ClassName Test
 * @SubmitTime 周二
 * @DATE 2023/11/21
 * @Time 11:21
 * @Package_Name PACKAGE_NAME
 */
public class wiojkad {
    @Test
    void s() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfiguration01.class);
        Student01 student01 = applicationContext.getBean("student", Student01.class);
        System.out.println(student01);
        ArtTeacher artTeacher = applicationContext.getBean("teacher", ArtTeacher.class);
        System.out.println(artTeacher);
    }
}
