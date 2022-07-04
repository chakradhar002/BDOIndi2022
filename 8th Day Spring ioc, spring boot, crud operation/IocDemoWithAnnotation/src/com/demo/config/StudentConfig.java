package com.demo.config;

import org.springframework.context.annotation.Bean;

import com.demo.Student;

public class StudentConfig {
 
	@Bean
	Student student() {

		return new Student();

	}

}
