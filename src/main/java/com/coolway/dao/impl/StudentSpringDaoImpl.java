package com.coolway.dao.impl;

import com.coolway.bean.Student;
import com.coolway.dao.StudentSpringDao;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class StudentSpringDaoImpl extends SqlSessionDaoSupport implements StudentSpringDao {
    public List<Student> queryStudentByIds(List<String> list) {
        SqlSession sqlSession = super.getSqlSession();
        List<Student> studentList = sqlSession.selectList("queryStudentByIds", list);
        return studentList;
    }
}
