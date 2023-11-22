package cn.edu.tyut.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;

/**
 * @Author 羊羊
 * @ClassName TestEvent
 * @SubmitTime 周三
 * @DATE 2023/11/22
 * @Time 13:02
 * @Package_Name cn.edu.tyut.event
 */

public class TestEvent extends ApplicationEvent {
    public TestEvent(Object source) {
        super(source);
    }
}
