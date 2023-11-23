package proxy;

import aspect.MyAspect;
import dao.UserDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author 羊羊
 * @ClassName MyProxy
 * @SubmitTime 周四
 * @DATE 2023/11/23
 * @Time 15:04
 * @Package_Name proxy
 */
public class MyProxy implements InvocationHandler {
    private UserDao userDao;

    public Object createProxy(UserDao userDao) {
        this.userDao = userDao;
        ClassLoader classLoader = MyProxy.class.getClassLoader();
        Class[] classes = userDao.getClass().getInterfaces();
        return Proxy.newProxyInstance(classLoader, classes, this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        MyAspect myAspect = new MyAspect();
        myAspect.check_Permissions();
        Object invoke = method.invoke(userDao, args);
        myAspect.log();
        return invoke;
    }
}
