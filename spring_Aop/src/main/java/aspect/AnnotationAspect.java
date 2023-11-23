package aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @Author 羊羊
 * @ClassName AnnotationAspect
 * @SubmitTime 周四
 * @DATE 2023/11/23
 * @Time 16:04
 * @Package_Name aspect
 */
@Aspect
public class AnnotationAspect {
    @Pointcut("execution(void dao.impl.StudentDaoImpl.*(..))")
    public void pointCut() {
    }

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) {
        Object[] args = proceedingJoinPoint.getArgs();
        Object retVal;
        try {
            System.out.println("before around ...");
            retVal = proceedingJoinPoint.proceed(args);
            System.out.println("around-Returning ...");
        } catch (Throwable e) {
            System.out.println("around-Throwing ...");
            throw new RuntimeException(e);
        } finally {
            System.out.println("after around ...");
        }
        return retVal;
    }

    @Before("pointCut()")
    public void before() {
        System.out.println("before ...");
    }

    @After("pointCut()")
    public void after() {
        System.out.println("after ...");
    }


    @AfterReturning("pointCut()")
    public void afterReturning() {
        System.out.println("after-Returning ...");
    }

    @AfterThrowing("pointCut()")
    public void afterThrowing() {
        System.out.println("after-Throwing ...");
    }
}
