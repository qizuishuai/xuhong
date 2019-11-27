package com.jdgl.xuhong.controller;

import com.jdgl.xuhong.entity.Student;
import com.jdgl.xuhong.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("aa")
    @ResponseBody
    public List<Student> getAll() {

        return studentService.getAll();
    };

}
