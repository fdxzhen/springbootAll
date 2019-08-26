package com.zhenhao.service;

import com.zhenhao.bean.Student;

public interface StudentService {
    int add(Student student);
    int update(Student student);
    int deleteBysno(String sno);
    Student queryStudentBySno(String sno);
}
