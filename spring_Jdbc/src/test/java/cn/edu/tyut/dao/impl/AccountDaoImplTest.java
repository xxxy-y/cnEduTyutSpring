package cn.edu.tyut.dao.impl;

import cn.edu.tyut.dao.AccountDao;
import cn.edu.tyut.entity.Account;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author 羊羊
 * @ClassName AccountDaoImplTest
 * @SubmitTime 周日
 * @DATE 2023/12/3
 * @Time 9:37
 * @Package_Name cn.edu.tyut.dao.impl
 */
class AccountDaoImplTest {
    @Test
    void addAccount() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao accountDao = applicationContext.getBean("accountDao", AccountDao.class);
        Account account = new Account();
        account.setId(8);
        account.setUsername("yyy");
        account.setBalance(333.11);
        int i = accountDao.addAccount(account);
        if (i > 0) {
            System.out.println("success add account : " + account);
        } else {
            System.out.println("false add account : " + account);
        }
    }

    @Test
    void updateAccount() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao accountDao = applicationContext.getBean("accountDao", AccountDao.class);
        Account account = new Account();
        account.setId(3);
        account.setUsername("uid");
        account.setBalance(999.99);
        int i = accountDao.updateAccount(account);
        if (i > 0) {
            System.out.println("update " + account.getId() + " success !");
        } else {
            System.out.println("update " + account.getId() + " false !");
        }
    }

    @Test
    void deleteAccount() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao accountDao = applicationContext.getBean("accountDao", AccountDao.class);
        Scanner scanner = new Scanner(System.in);
        int i = accountDao.deleteAccount(4);
        if (i > 0) {
            System.out.println("success delete account: id = " + "4");
        } else {
            System.out.println("false delete account: id = " + "4");
        }
    }
}