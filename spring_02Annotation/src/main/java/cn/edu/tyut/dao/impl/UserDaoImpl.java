package cn.edu.tyut.dao.impl;

import cn.edu.tyut.dao.UserDao;
import cn.edu.tyut.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

/**
 * @Author 羊羊
 * @ClassName UserDaoImpl
 * @SubmitTime 周一
 * @DATE 2023/11/20
 * @Time 16:30
 * @Package_Name cn.edu.tyut.dao.impl
 */
@Repository("UserDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);
        System.out.println("work UserDaoImpl.save()");
    }
}
