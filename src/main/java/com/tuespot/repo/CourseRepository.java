package com.tuespot.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tuespot.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{
	
	//public List<Course> findByCourse(List<Course> courses2);
	List<Course> findAllById(Long courseId);

}
