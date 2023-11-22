package cn.edu.tyut.listener;

import cn.edu.tyut.event.TestEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Author 羊羊
 * @ClassName TestListener
 * @SubmitTime 周三
 * @DATE 2023/11/22
 * @Time 13:03
 * @Package_Name cn.edu.tyut.listener
 */
@Component
public class TestListener implements ApplicationListener<TestEvent> {
    /**
     * 要发布事件，需要拿到ApplicationEventPublisher，这里我们通过Aware在初始化的时候拿到
     * 实际上我们的ApplicationContext就是ApplicationEventPublisher的实现类，这里拿到的就是我们创建的ApplicationContext对象
     * 直接通过ApplicationEventPublisher的publishEvent方法发布事件
     * 这样，所有这个事件的监听器，都会监听到这个事件发生了
     * @param event the event to respond to
     */
    @Override
    public void onApplicationEvent(TestEvent event) {
        System.out.println(event.getClass());
        System.out.println("监听到自定义事件");
    }
}
