package cn.edu.tyut.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author 羊羊
 * @ClassName StudentAspect
 * @SubmitTime 周五
 * @DATE 2023/11/24
 * @Time 22:05
 * @Package_Name cn.edu.tyut.aspect
 */
@Aspect
@Component
public class StudentAspect {
    @Pointcut("execution(void cn.edu.tyut.dao.*.*(..))")
    public void pointCut() {
    }

    @Before("pointCut()")
    public void before() {
        System.out.println("before ...");
    }

    @After("execution(void cn.edu.tyut.entity.Student.*(..))")
    public void after() {
        System.out.println("after ...");
    }
}