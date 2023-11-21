package cn.edu.tyut.entity;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @Author 羊羊
 * @ClassName Student02
 * @SubmitTime 周二
 * @DATE 2023/11/21
 * @Time 11:45
 * @Package_Name cn.edu.tyut.entity
 */
public class Student02 {
    @Autowired
    @Qualifier(value = "a")
    private Teacher teacher;

    @PreDestroy
    public void destroy() {
        System.out.println("destroy");
    }

    @PostConstruct
    public void init() {
        System.out.println("init");
    }
}