package com.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Student {
	@Id
	private String studentRollNumber ; 
	private String studentName ; 
	private int studentAge ; 
	private String studentGender ; 
	private String studentGrade ; 
	private String studentSection ;
	
	@ManyToOne
	@JoinColumn(name="schoolid")
	private School school;
	
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	public String getStudentRollNumber() {
		return studentRollNumber;
	}
	public void setStudentRollNumber(String studentRollNumber) {
		this.studentRollNumber = studentRollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {	 	  	  		    	  	      	      	 	
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public String getStudentGender() {
		return studentGender;
	}
	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}
	public String getStudentGrade() {
		return studentGrade;
	}
	public void setStudentGrade(String studentGrade) {
		this.studentGrade = studentGrade;
	}
	public String getStudentSection() {
		return studentSection;
	}
	public void setStudentSection(String studentSection) {
		this.studentSection = studentSection;
	} 
	
	
}
	 	  	  		    	  	      	      	 	
