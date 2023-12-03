package cn.edu.tyut.dao.impl;

import cn.edu.tyut.dao.StudentDao;
import cn.edu.tyut.entity.Student;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

/**
 * @Author 羊羊
 * @ClassName StudentDaoImpl
 * @SubmitTime 周日
 * @DATE 2023/12/3
 * @Time 17:50
 * @Package_Name cn.edu.tyut.dao.impl
 */
public class StudentDaoImpl implements StudentDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /**
     * student
     *
     * @param student username and password
     * @return pas
     */
    @Override
    public Student log(Student student) {
        String sql = "SELECT * FROM student WHERE username=?";
        RowMapper<Student> rowMapper = new BeanPropertyRowMapper<>(Student.class);
        return this.jdbcTemplate.queryForObject(sql, rowMapper, student.getUsername());
    }

    /**
     * all student
     *
     * @return list contain all student
     */
    @Override
    public List<Student> selectAllStudent() {
        String sql = "SELECT * FROM student";
        RowMapper<Student> rowMapper = new BeanPropertyRowMapper<>(Student.class);
        return this.jdbcTemplate.query(sql, rowMapper);
    }
}
