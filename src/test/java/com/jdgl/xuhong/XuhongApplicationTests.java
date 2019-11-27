package com.jdgl.xuhong;

import com.jdgl.xuhong.dao.StudentDao;
import com.jdgl.xuhong.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class XuhongApplicationTests {

	@Autowired
	private StudentDao studentDao;



	@Test
	void selsctgetall() {
		List<Student> s=studentDao.getAll();
		System.out.println(s);
	}

}
