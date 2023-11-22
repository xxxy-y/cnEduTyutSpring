package cn.edu.tyut.entity;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author 羊羊
 * @ClassName Student
 * @SubmitTime 周三
 * @DATE 2023/11/22
 * @Time 9:32
 * @Package_Name cn.edu.tyut.entity
 */
@Component
public class Student {
    public void syncTest() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + "我是同步执行的方法，开始...");
        Thread.sleep(3000);
        System.out.println("我是同步执行的方法，结束！");
    }

    /**
     * 加一个注解就可以实现异步方法的原因是Spring帮助我们动态生成的一个代理类，我们原本的类代码已经被修改了，这都是AOP的功劳
     *
     * @throws InterruptedException >
     */
    @Async
    public void asyncTest() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + "我是异步执行的方法，开始...");
        Thread.sleep(3000);
        System.out.println("我是异步执行的方法，结束！");
    }


    /**
     * 定时方法不需要主动调用
     * 定时方法需要指定' cron', 'fixedDelay(String)', or 'fixedRate(String)'的其中一个，否则无法创建定时任务，他们的区别如下：
     * fixedDelay：在上一次定时任务执行完之后，间隔多久继续执行。
     * fixedRate：无论上一次定时任务有没有执行完成，两次任务之间的时间间隔。
     * cron：如果嫌上面两个不够灵活，你还可以使用cron表达式来指定任务计划。
     * cron表达式：[<a href="https://blog.csdn.net/sunnyzyq/article/details/98597252">...</a>]
     */
    @Scheduled(fixedRate = 2000)
    public void task() {
        System.out.println("现在的时间为： " + new Date());
    }
}
