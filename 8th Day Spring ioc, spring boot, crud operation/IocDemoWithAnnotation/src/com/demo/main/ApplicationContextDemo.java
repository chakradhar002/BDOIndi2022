package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.demo.Student;
import com.demo.config.StudentConfig;

public class ApplicationContextDemo {

	public static void main(String[] args) {
		ApplicationContext s = new AnnotationConfigApplicationContext(StudentConfig.class);
		Student ss = s.getBean(Student.class);
		ss.setName("tom");
		ss.setCourse("phy");
		ss.show();
	}

}
