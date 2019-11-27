package com.jdgl.xuhong.text;

import com.jdgl.xuhong.dao.StudentDao;
import com.jdgl.xuhong.entity.Student;
import com.jdgl.xuhong.service.StudentService;
import com.jdgl.xuhong.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class text {

    public static void main(String[] args) {
        StudentService s=new StudentServiceImpl();

        System.out.println(s.getAll());

    }

}
