package aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @Author 羊羊
 * @ClassName MyAspect
 * @SubmitTime 周四
 * @DATE 2023/11/23
 * @Time 15:01
 * @Package_Name aspect
 */
public class MyAspect {
    public void checkPermissions() {
        System.out.println("模擬檢查權限...");
    }

    public void log() {
        System.out.println("模擬記錄日志...");
    }

    public void before() {
        System.out.println("這是前置通知");
    }

    /**
     * 常用的JoinPoint方法包括：
     * <p>
     * Signature getSignature()：获取连接点的签名，包括方法名、参数类型等信息。
     * <p>
     * Object[] getArgs()：获取连接点方法的参数。
     * <p>
     * Object getTarget()：获取连接点所在的目标对象。
     * <p>
     * Object getThis()：获取代理对象。
     * <p>
     * String toString()：以字符串形式返回连接点的描述。
     *
     * @param joinPoint 是在切面逻辑中使用的一个关键对象。它代表了在程序执行过程中切入切面逻辑的点，可以理解为程序运行时的特定位置。
     * <p>
     * JoinPoint提供了许多有用的方法，可以让切面逻辑获取和操作与连接点相关的信息
     *
     * 在AOP中的作用是提供了切入特定位置的能力，并且可以获取和操作连接点的相关信息，使得我们可以在切面逻辑中实现各种操作，如日志记录、参数验证、性能监控和异常处理等
     */
    public void after(JoinPoint joinPoint) {
        System.out.print("這是後置方法, ");
        System.out.print("目標類是: " + joinPoint.getTarget());
        System.out.println(", 被織入增强處理的目標方法為: " + joinPoint.getSignature().getName());
    }


    public Object around(ProceedingJoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        Object retVal;
        try {
            System.out.println("這是環繞前方法");
            retVal = joinPoint.proceed(args);
//            int a = 1 / 0;
            System.out.println("這是環繞后after-Returning方法");
        } catch (Throwable e) {
            System.out.println("這是after-Throwing輸出");
            throw new RuntimeException(e);
        } finally {
            System.out.println("這是after輸出");
        }
        return retVal;
    }

    public void afterReturning() {
        System.out.println("这是after-Returning方法");
    }

    public void afterThrowing() {
        System.out.println("这是after-Throwing方法");
    }
}
