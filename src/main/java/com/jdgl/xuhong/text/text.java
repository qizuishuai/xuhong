package com.jdgl.xuhong.text;

import com.jdgl.xuhong.service.StudentService;
import com.jdgl.xuhong.service.impl.StudentServiceImpl;

public class text {

    public static void main(String[] args) {
        StudentService s=new StudentServiceImpl();

        System.out.println(s.getAll());

    }

}
