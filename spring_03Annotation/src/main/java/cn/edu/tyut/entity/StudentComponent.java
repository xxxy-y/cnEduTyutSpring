package cn.edu.tyut.entity;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author 羊羊
 * @ClassName StudentCompontent
 * @SubmitTime 周二
 * @DATE 2023/11/21
 * @Time 11:52
 * @Package_Name cn.edu.tyut.entity
 */
@Component
@ToString
public class StudentComponent {
    private Teacher teacher;

    /**
     * 如果有Teacher类型的Bean，那么这里的参数会被自动注入
     * 无论是使用@Component注册的Bean还是在配置类中@Bean注册的Bean，如果其构造方法不是无参构造函数，那么默认会对构造函数中的每一个参数都进行自动装配进Bean中。
     * @param teacher 自动注入
     */
    public StudentComponent(Teacher teacher) {
        this.teacher = teacher;
    }
}