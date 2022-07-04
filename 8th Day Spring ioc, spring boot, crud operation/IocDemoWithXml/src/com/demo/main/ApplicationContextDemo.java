package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.demo.Student;

public class ApplicationContextDemo {

	public static void main(String[] args) {
		ApplicationContext s = new FileSystemXmlApplicationContext("applicationContext.xml");
		Student s1 = (Student) s.getBean("mybean");
		// student s= new Student()  s.show
		s1.show();
	}

}
