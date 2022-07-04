package com.demo.dao;

import com.demo.entity.InstructorDetails;

public interface InstructorDetailsDao {
	
	void saveInstructorDetail(InstructorDetails instructorDetail);

	void updateInstructorDetails(InstructorDetails instructorDetail);

	InstructorDetails getInstructorDetail(int id);

}
