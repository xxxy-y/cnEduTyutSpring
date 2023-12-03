package cn.edu.tyut.dao;

import cn.edu.tyut.entity.Student;
import org.springframework.expression.spel.ast.OpModulus;

import java.util.List;

/**
 * @Author 羊羊
 * @ClassName StudentDao
 * @SubmitTime 周日
 * @DATE 2023/12/3
 * @Time 17:50
 * @Package_Name cn.edu.tyut.dao
 */
public interface StudentDao {
    /**
     * student
     *
     * @param student username and password
     * @return String
     */
    Student log(Student student);

    /**
     * all student
     *
     * @return list contain all student
     */
    List<Student> selectAllStudent();
}
