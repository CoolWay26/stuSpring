package com.coolway.dao;

import com.coolway.bean.Student;

import java.util.List;

public interface StudentMapper {
    List<Student> queryStudentByIds(List<String> list);
}
