package cn.edu.tyut.config;

import cn.edu.tyut.entity.Teacher;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Author 羊羊
 * @ClassName ConfigurationComponent
 * @SubmitTime 周二
 * @DATE 2023/11/21
 * @Time 11:53
 * @Package_Name cn.edu.tyut.config
 */
@Configuration
@ComponentScans({
        @ComponentScan("cn.edu.tyut.entity")
})
public class ConfigurationComponent {
}