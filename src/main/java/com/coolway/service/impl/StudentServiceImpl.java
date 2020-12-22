package com.coolway.service.impl;

import com.coolway.bean.Student;
import com.coolway.dao.StudentDao;
import com.coolway.dao.impl.StudentDaoImpl;
import com.coolway.service.StudentService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service("StudentServiceImpl")
public class StudentServiceImpl implements StudentService {

    @Resource(name = "StudentDaoImpl")
    private StudentDaoImpl studentDao;

    public List<Student> getStudent() {
        System.out.println("获取Student");
        List<Student> list = new ArrayList<Student>();
        return list;
    }

    public void deleteStudent() {
        System.out.println("删除Student");
    }

    @Transactional(isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRED)
    public void saveStudent() {
        System.out.println("保存/更新Student");
        studentDao.saveStudent();
    }
}
