package cn.edu.tyut.dao;

import cn.edu.tyut.config.MainConfiguration;
import cn.edu.tyut.entity.Student;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author 羊羊
 * @ClassName StudentMapperTest
 * @SubmitTime 周一
 * @DATE 2023/12/4
 * @Time 16:37
 * @Package_Name cn.edu.tyut.dao
 */
class StudentMapperTest {

    @Test
    void selectAllStudent() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfiguration.class);
        StudentMapper studentMapper = applicationContext.getBean("studentMapper", StudentMapper.class);
        List<Student> students = studentMapper.selectAllStudent();
        students.forEach(System.out::println);

//        ApplicationContext applicationContext1 = new AnnotationConfigApplicationContext(MainConfiguration.class);
//        SqlSessionTemplate sqlSessionTemplate = applicationContext1.getBean("sqlSessionTemplate", SqlSessionTemplate.class);
//        StudentMapper mapper = sqlSessionTemplate.getMapper(StudentMapper.class);
//        List<Student> students1 = mapper.selectAllStudent();
//        students1.forEach(System.out::println);
    }
}