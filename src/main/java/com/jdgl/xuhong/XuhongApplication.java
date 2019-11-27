package com.jdgl.xuhong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jdgl.xuhong.dao")
public class XuhongApplication {

	public static void main(String[] args) {
		SpringApplication.run(XuhongApplication.class, args);
	}

}
