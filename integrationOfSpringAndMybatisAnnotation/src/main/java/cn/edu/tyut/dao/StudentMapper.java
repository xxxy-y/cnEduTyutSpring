package cn.edu.tyut.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author 羊羊
 * @ClassName StudentMapper
 * @SubmitTime 周一
 * @DATE 2023/12/4
 * @Time 19:46
 * @Package_Name cn.edu.tyut.dao
 */
@Mapper
public interface StudentMapper {
    /**
     * insert spring
     */
    @Insert("insert into student(username, password) values('测试', '男')")
    void insertStudent();
}
