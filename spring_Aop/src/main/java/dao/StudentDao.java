package dao;

/**
 * @Author 羊羊
 * @ClassName StudentDao
 * @SubmitTime 周四
 * @DATE 2023/11/23
 * @Time 16:13
 * @Package_Name dao
 */
public interface StudentDao {
    /**
     * >
     */
    void addStudent();

    /**
     * >
     */
    void deleteStudent();

    /**
     * 在方法中使用参数, 在增强的方法中也能拿到这个参数.
     * @param string >
     */
    void testString(String string);
}
