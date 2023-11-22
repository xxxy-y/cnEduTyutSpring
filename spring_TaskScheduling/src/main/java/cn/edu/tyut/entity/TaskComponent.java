package cn.edu.tyut.entity;

import cn.edu.tyut.event.TestEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Author 羊羊
 * @ClassName TaskComponent
 * @SubmitTime 周三
 * @DATE 2023/11/22
 * @Time 13:06
 * @Package_Name cn.edu.tyut.entity
 */
@Component
public class TaskComponent implements ApplicationEventPublisherAware {
    ApplicationEventPublisher applicationEventPublisher;

    @Scheduled(fixedRate = 1000)
    public void task() {
        applicationEventPublisher.publishEvent(new TestEvent(this));
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
