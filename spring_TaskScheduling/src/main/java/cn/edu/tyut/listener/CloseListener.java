package cn.edu.tyut.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;

/**
 * @Author 羊羊
 * @ClassName CloseListener
 * @SubmitTime 周三
 * @DATE 2023/11/22
 * @Time 12:56
 * @Package_Name cn.edu.tyut.listener
 */
@Component
public class CloseListener implements ApplicationListener<ContextClosedEvent> {
    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println(event.getApplicationContext());
        System.out.println("监听到关闭事件");
    }
}
