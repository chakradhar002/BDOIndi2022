package com.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name="instructor")
@Entity
public class Instructor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	

	private String firstname;
	private String lastname;
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="instructor_details_id")
	InstructorDetails InstructorDetails;
	
	
	public Instructor() {}
	

 	public Instructor(String firstname, String lastname, String email) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	public InstructorDetails getInstructorDetails() {
		return InstructorDetails;
	}


	public void setInstructorDetails(InstructorDetails instructorDetails) {
		InstructorDetails = instructorDetails;
	}

}
