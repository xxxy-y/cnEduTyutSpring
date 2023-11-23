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
    public void check_Permissions() {
        System.out.println("模擬檢查權限...");
    }

    public void log() {
        System.out.println("模擬記錄日志...");
    }

    public void before() {
        System.out.println("這是前置通知");
    }

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
