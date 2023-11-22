package cn.edu.tyut.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author 羊羊
 * @ClassName MainConfiguration
 * @SubmitTime 周三
 * @DATE 2023/11/22
 * @Time 14:33
 * @Package_Name cn.edu.tyut.config
 */
@Configuration
@ComponentScans({
        @ComponentScan("cn.edu.tyut.entity")
})
@PropertySource("classpath:test.properties")
public class MainConfiguration {
}