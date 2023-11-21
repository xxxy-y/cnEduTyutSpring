package cn.edu.tyut.service.impl;

import cn.edu.tyut.dao.UserDao;
import cn.edu.tyut.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Service;

/**
 * @Author 羊羊
 * @ClassName UserServiceImpl
 * @SubmitTime 周一
 * @DATE 2023/11/20
 * @Time 16:30
 * @Package_Name cn.edu.tyut.service.impl
 */
@Service
public class UserServiceImpl implements UserService {
    UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        this.userDao.save();
        System.out.println("UserServiceImpl.save()");
    }
}
