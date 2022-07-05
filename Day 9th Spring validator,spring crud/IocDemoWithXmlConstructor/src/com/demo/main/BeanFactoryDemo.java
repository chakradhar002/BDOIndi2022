package com.demo.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.demo.Student;

public class BeanFactoryDemo {

	public static void main(String[] args) {

		Resource r = new ClassPathResource("applicationContext.xml");
		BeanFactory f = new XmlBeanFactory(r);

		Student s = (Student) f.getBean("mybean");
		// student s= new Student()  s.show
		s.show();

	}

}
