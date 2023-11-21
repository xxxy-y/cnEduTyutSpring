package cn.edu.tyut.config;

import cn.edu.tyut.entity.Student01;
import cn.edu.tyut.entity.Teacher;
import org.springframework.context.annotation.*;

/**
 * @Author 羊羊
 * @ClassName MainConfiguration
 * @SubmitTime 周二
 * @DATE 2023/11/21
 * @Time 10:47
 * @Package_Name cn.edu.tyut.config
 */
@Configuration
@Import(ImportConfiguration.class)
public class MainConfiguration01 {
    /**
     * 当使用这种方式来注入teacher时，实际上是通过构造方法来实现注入，它会自动将参数自动装配进入，所以需要在实体类中定义一个该参数的构造方法
     * 无论是使用@Component注册的Bean还是在配置类中@Bean注册的Bean，如果其构造方法不是无参构造函数，那么默认会对构造函数中的每一个参数都进行自动装配进Bean中。
     * @param teacher >>
     * @return <<
     */
    @Lazy(value = false)
    @Scope("prototype")
    @DependsOn("teacher")
    @Bean(name = "student", initMethod = "init", destroyMethod = "destroy", autowireCandidate = false)
    public Student01 student(Teacher teacher) {
        return new Student01(teacher);
    }
}