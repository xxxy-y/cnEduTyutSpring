package dao.impl;

import dao.StudentDao;

/**
 * @Author 羊羊
 * @ClassName StudentDaoImpl
 * @SubmitTime 周四
 * @DATE 2023/11/23
 * @Time 16:14
 * @Package_Name dao.impl
 */
public class StudentDaoImpl implements StudentDao {

    /**
     * >
     */
    @Override
    public void addStudent() {
        System.out.println("addStudent ...");
    }

    /**
     * >
     */
    @Override
    public void deleteStudent() {
        System.out.println("deleteStudent ...");
    }

    /**
     * 在方法中使用参数, 在增强的方法中也能拿到这个参数.
     *
     * @param string >
     */
    @Override
    public void testString(String string) {
        System.out.println(string + "在StudentDaoImpl中已经输出了");
    }
}
