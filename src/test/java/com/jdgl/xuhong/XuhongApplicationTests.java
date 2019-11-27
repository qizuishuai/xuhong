package com.jdgl.xuhong;

import com.jdgl.xuhong.dao.StudentMapper;
import com.jdgl.xuhong.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class XuhongApplicationTests {

	@Autowired
	private StudentMapper studentMapper;



	@Test
	void selsctgetall() {
		List<Student> s= studentMapper.getAll();
		System.out.println(s);
	}

}
