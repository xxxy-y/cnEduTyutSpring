package cn.edu.tyut.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author 羊羊
 * @ClassName MainConfiguration
 * @SubmitTime 周五
 * @DATE 2023/11/24
 * @Time 22:03
 * @Package_Name cn.edu.tyut.config
 */
@Configuration
@ComponentScans({
        @ComponentScan("cn.edu.tyut.entity"),
        @ComponentScan("cn.edu.tyut.aspect"),
        @ComponentScan("cn.edu.tyut.dao")
})
@EnableAspectJAutoProxy
public class MainConfiguration {
}
