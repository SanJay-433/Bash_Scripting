package com.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.School;
import com.bean.Student;
import com.repository.SchoolRepository;
import com.repository.StudentRepository;

@Repository
public class SchoolDAO {
	
	@Autowired
	private SchoolRepository schoolRepo;
	
	@Autowired
	private StudentRepository studentRepo;

	public void addSchool(School school){
		schoolRepo.save(school);
	}
	
	
	public void registerStudentToSchool(String schoolId, List<Student> student ) {
		Optional<School> op=schoolRepo.findById(schoolId);
		School sh = op.get();
		for(Student s : student) {
			s.setSchool(sh);
			studentRepo.save(s);
		}
	}

	
	public List<School> schoolWithMaximumStudents(String city){	 	  	  		    	  	      	      	 	
		List<School> list = schoolRepo.findSchoolsWithMaxStudentsInCity(city);
	return list;
	    
	}
}
