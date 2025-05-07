package com.bean;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class School {
	
	@Id
	private String schoolId ;
	private String schoolName ;
	private String schoolType ;
	private String city ;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="school")	
	private List<Student> studentList=new ArrayList<Student>();
	public String getSchoolId() {
		return schoolId;
	}
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {	 	  	  		    	  	      	      	 	
		this.schoolName = schoolName;
	}
	public String getSchoolType() {
		return schoolType;
	}
	public void setSchoolType(String schoolType) {
		this.schoolType = schoolType;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}


}
