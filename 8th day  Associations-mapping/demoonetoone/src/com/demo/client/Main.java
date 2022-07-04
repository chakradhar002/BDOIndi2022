package com.demo.client;

import com.demo.daoImp.InstructorDaoImpl;
import com.demo.daoImp.InstructorDetailsImpl;
import com.demo.entity.Instructor;
import com.demo.entity.InstructorDetails;

public class Main {

	public static void main(String[] args) {

		Instructor instructor = new Instructor("Ram","kumar","ram@gmail.com");
		
		InstructorDetails instructorDetails = new InstructorDetails("www.youtube","teaching");
		
		
		instructor.setInstructorDetails(instructorDetails);// making associate of intructor to instructordeails
		
		InstructorDaoImpl s = new InstructorDaoImpl();
		
	    s.saveInstructor(instructor);
		
		System.out.println("done");

	}

}
