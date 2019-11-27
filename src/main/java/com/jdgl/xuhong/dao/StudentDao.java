package com.jdgl.xuhong.dao;
import	java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jdgl.xuhong.entity.Student;
import org.apache.ibatis.annotations.Select;

public interface StudentDao extends BaseMapper<Student> {

    @Select("select * from student")
    List<Student> getAll();

}
