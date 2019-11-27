package com.jdgl.xuhong.service.impl;

import com.jdgl.xuhong.dao.StudentMapper;
import com.jdgl.xuhong.entity.Student;
import com.jdgl.xuhong.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> getAll() {
        return studentMapper.getAll();
    }
}
