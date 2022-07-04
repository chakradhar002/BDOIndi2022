package com.demo.dao;

import com.demo.entity.Instructor;

public interface InstructorDao {
	
	void saveInstructor(Instructor instructor);

	void updateInstructor(Instructor instructor);

	void deleteInstructor(long id);
	
//	void deleteAllInstructor();

//	Instructor getInstructorList();
	
	Instructor getInstructorById(long id);
	

}
