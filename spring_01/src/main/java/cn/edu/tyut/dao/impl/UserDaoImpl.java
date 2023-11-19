package cn.edu.tyut.dao.impl;

import cn.edu.tyut.dao.UserDao;

import java.util.Objects;

/**
 * @Author 羊羊
 * @ClassName UserDaoImpl
 * @SubmitTime 周日
 * @DATE 2023/11/19
 * @Time 11:48
 * @Package_Name cn.edu.tyut.dao.impl
 */
public class UserDaoImpl implements UserDao {
    private static final String NAME_USER = "张三";
    private static final String PASSWORD_USER = "123456";

    @Override
    public void login(String name, String password) {
        if(Objects.equals(name, NAME_USER) && Objects.equals(password, PASSWORD_USER)) {
            System.out.println("登录成功");
            return;
        }
        System.out.println("登录失败");
    }
}
