package cn.edu.tyut.service.impl;

import cn.edu.tyut.dao.StudentMapper;
import cn.edu.tyut.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author 羊羊
 * @ClassName StudentServiceImpl
 * @SubmitTime 周一
 * @DATE 2023/12/4
 * @Time 19:51
 * @Package_Name cn.edu.tyut.service.impl
 */
@Service
public class StudentServiceImpl implements StudentService {
    private StudentMapper studentMapper;

    @Autowired
    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    @Transactional
    public void test() {
        studentMapper.insertStudent();
    }
}
