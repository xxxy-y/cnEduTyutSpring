package cn.edu.tyut.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @Author 羊羊
 * @ClassName TestListener
 * @SubmitTime 周三
 * @DATE 2023/11/22
 * @Time 12:49
 * @Package_Name cn.edu.tyut.listener
 */
@Component
public class RefreshListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println(event.getApplicationContext());
        System.out.println("监听到刷新事件");
    }
}
