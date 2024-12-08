package com.gradingsystem.student.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gradingsystem.student.model.Assignment;

public interface AssignmentRepository extends JpaRepository<Assignment, String>{
	
	@Query("SELECT A FROM Assignment A WHERE A.faculty_id=:facultyId")
	List<Assignment> findByFacultyId(int facultyId);

}
