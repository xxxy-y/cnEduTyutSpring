package cn.edu.tyut.dao;

import cn.edu.tyut.entity.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author 羊羊
 * @ClassName StudentMapper
 * @SubmitTime 周一
 * @DATE 2023/12/4
 * @Time 15:50
 * @Package_Name cn.edu.tyut.dao
 */
public interface StudentMapper {
    /**
     * select all students
     * @return List<Student>
     */
    @Select("SELECT * FROM student")
    List<Student> selectAllStudent();
}
