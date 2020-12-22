package com.coolway.dao.impl;

import com.coolway.bean.Student;
import com.coolway.dao.StudentDao;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository("StudentDaoImpl")
public class StudentDaoImpl implements StudentDao {
    @Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    public void saveStudent() {
        String sql = "insert into student(id,name,sex,age,clazz) value('20200007', 'xxx', '男', 22, '三班')";
        jdbcTemplate.update(sql);
        int i = 1/0;
    }

}
