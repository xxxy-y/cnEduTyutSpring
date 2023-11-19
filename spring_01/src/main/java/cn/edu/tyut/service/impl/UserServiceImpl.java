package cn.edu.tyut.service.impl;

import cn.edu.tyut.dao.UserDao;
import cn.edu.tyut.service.UserService;

/**
 * @Author 羊羊
 * @ClassName UserServiceImpl
 * @SubmitTime 周日
 * @DATE 2023/11/19
 * @Time 11:51
 * @Package_Name cn.edu.tyut.service.impl
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void login(String name, String password) {
        userDao.login(name, password);
    }
}