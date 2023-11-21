package cn.edu.tyut.config;

import cn.edu.tyut.entity.ArtTeacher;
import cn.edu.tyut.entity.Teacher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author 羊羊
 * @ClassName ImportConfiguration
 * @SubmitTime 周二
 * @DATE 2023/11/21
 * @Time 11:26
 * @Package_Name cn.edu.tyut.config
 */
@Configuration
public class ImportConfiguration {
    @Bean
    public Teacher teacher() {
        return new ArtTeacher();
    }
}
