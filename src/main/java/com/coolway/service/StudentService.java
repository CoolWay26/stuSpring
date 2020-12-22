package com.coolway.service;

import com.coolway.bean.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
    List<Student> getStudent();
    void deleteStudent();
    void saveStudent();
}
