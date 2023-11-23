package dao.impl;

import dao.UserDao;

/**
 * @Author 羊羊
 * @ClassName UserDaoImpl
 * @SubmitTime 周四
 * @DATE 2023/11/23
 * @Time 14:59
 * @Package_Name dao.impl
 */
public class UserDaoImpl implements UserDao {

    @Override
    public void addUser() {
        System.out.println("添加用戶");
    }

    @Override
    public void deleteUser() {
        System.out.println("刪除用戶");
    }
}