package cn.edu.tyut.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author 羊羊
 * @ClassName MainConfiguration
 * @SubmitTime 周三
 * @DATE 2023/11/22
 * @Time 9:31
 * @Package_Name cn.edu.tyut.config
 */
@Configuration
@ComponentScans({
        @ComponentScan("cn.edu.tyut.entity")
})
@EnableAsync
@EnableScheduling
public class MainConfiguration {
}
