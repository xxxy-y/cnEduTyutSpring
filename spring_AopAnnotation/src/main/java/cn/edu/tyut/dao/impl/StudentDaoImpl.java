package cn.edu.tyut.dao.impl;

import cn.edu.tyut.dao.StudentDao;
import org.springframework.stereotype.Component;

/**
 * @Author 羊羊
 * @ClassName StudentDaoImpl
 * @SubmitTime 周五
 * @DATE 2023/11/24
 * @Time 22:12
 * @Package_Name cn.edu.tyut.dao.impl
 */
@Component
public class StudentDaoImpl implements StudentDao {
    /**
     *
     */
    @Override
    public void addStudent() {
        System.out.println("add student ...");
    }

    /**
     *
     */
    @Override
    public void deleteStudent() {
        System.out.println("delete student ...");
    }
}
