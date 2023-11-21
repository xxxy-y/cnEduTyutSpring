package cn.edu.tyut.config;

import cn.edu.tyut.entity.ArtTeacher;
import cn.edu.tyut.entity.Student01;
import cn.edu.tyut.entity.Student02;
import cn.edu.tyut.entity.Teacher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author 羊羊
 * @ClassName MainConfiguration02
 * @SubmitTime 周二
 * @DATE 2023/11/21
 * @Time 11:44
 * @Package_Name cn.edu.tyut.config
 */
@Configuration
public class MainConfiguration02 {
    @Bean
    public Student02 student() {
        return new Student02();
    }

    @Bean("a")
    public Teacher teacherA() {
        return new ArtTeacher();
    }

    @Bean("b")
    public Teacher teacherB() {
        return new ArtTeacher();
    }
}
