package aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.jetbrains.annotations.NotNull;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Author 羊羊
 * @ClassName InterfaceAspect
 * @SubmitTime 周五
 * @DATE 2023/11/24
 * @Time 21:52
 * @Package_Name aspect
 */
public class InterfaceAspect implements MethodBeforeAdvice, AfterReturningAdvice, MethodInterceptor {
    /**
     * @param method >
     * @param args >
     * @param target >
     * @throws Throwable >
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("before ...");
    }

    /**
     * @param returnValue >
     * @param method >
     * @param args >
     * @param target >
     * @throws Throwable >
     */
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("after ...");
    }

    /**
     * @param invocation >
     * @return >
     * @throws Throwable >
     */
    @Override
    public Object invoke(@NotNull MethodInvocation invocation) throws Throwable {
        System.out.println("before around ...");
        Object val = invocation.proceed();
        System.out.println("after around ...");
        return val;
    }
}
