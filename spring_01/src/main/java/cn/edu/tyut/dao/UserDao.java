package cn.edu.tyut.dao;

/**
 * @Author 羊羊
 * @ClassName UserDao
 * @SubmitTime 周日
 * @DATE 2023/11/19
 * @Time 11:45
 * @Package_Name cn.edu.tyut.DAO
 */
public interface UserDao {
    /**
     * >>
     *
     * @param name     >>
     * @param password >>
     */
    void login(String name, String password);
}