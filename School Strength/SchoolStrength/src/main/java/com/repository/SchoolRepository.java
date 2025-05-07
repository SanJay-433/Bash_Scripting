package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bean.School;

@Repository
public interface SchoolRepository extends JpaRepository<School,String>{


        // @Query(value = "SELECT s.* FROM School s " +
        // "JOIN (SELECT s2.school_id, COUNT(st.student_roll_number) AS studentCount " +
        // "FROM School s2 " +
        // "JOIN Student st ON s2.school_id = st.schoolid " +
        // "WHERE s2.city = :city " +
        // "GROUP BY s2.school_id) counts ON s.school_id = counts.school_id " +
        // "WHERE s.city = :city AND counts.studentCount = " +
        // "(SELECT MAX(counts.studentCount) FROM " +
        // "(SELECT COUNT(st2.student_roll_number) AS studentCount FROM School s3 " +
        // "JOIN Student st2 ON s3.school_id = st2.schoolid " +
        // "WHERE s3.city = :city " +
        // "GROUP BY s3.school_id) counts)",
        // nativeQuery = true)
        
        
        @Query(value = "select s.* from school s join student st on s.school_id=st.schoolid where "+ 
              "s.city = :city group by s.school_id having count(st.student_roll_number)="+
              "(select max(cnt) from (select s.school_id,count(st.student_roll_number) cnt "+
              "from student st join school s on s.school_id=st.schoolid where s.city = :city "+
              "group by s.school_id) as temp1)",
                nativeQuery = true)
        
        // @Query("SELECT s FROM School s " +
        // "JOIN (SELECT s2.schoolId, COUNT(st.studentRollNumber) AS studentCount " +
        // "FROM School s2 " +
        // "JOIN s2.studentList st on s2.school_id = st.schoolid " +
        // "WHERE s2.city = :city " +
        // "GROUP BY s2.schoolId) counts ON s.schoolId = counts.schoolId " +
        // "WHERE s.city = :city AND counts.studentCount = " +
        // "(SELECT MAX(counts.studentCount) FROM " +
        // "(SELECT COUNT(st2.studentRollNumber) AS studentCount FROM School s3 " +
        // "JOIN s3.studentList st2 ON s3.schoolId = st2.schoolId " +
        // "WHERE s3.city = :city " +
        // "GROUP BY s3.schoolId) counts)")
        List<School> findSchoolsWithMaxStudentsInCity(@Param("city") String city);
}	 	  	  		    	  	      	      	 	
