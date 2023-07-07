package com.tuespot.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tuespot.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	
	List<Student> findAllById(Long studentId);

}
