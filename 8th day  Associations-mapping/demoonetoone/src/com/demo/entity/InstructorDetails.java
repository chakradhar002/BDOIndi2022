package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="instructordetails")
@Entity
public class InstructorDetails {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String youtubechannel;
	private String hooby;
	
	public InstructorDetails(String youtubechannel, String hooby) {
		
		this.youtubechannel= youtubechannel;
		this.hooby = hooby;
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getYoutubechannel() {
		return youtubechannel;
	}
	public void setYoutubechannel(String youtubechannel) {
		this.youtubechannel = youtubechannel;
	}
	public String getHooby() {
		return hooby;
	}
	public void setHooby(String hooby) {
		this.hooby = hooby;
	}
	
	

}
