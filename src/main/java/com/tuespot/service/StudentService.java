package com.tuespot.service;

import java.util.List;

import com.tuespot.entity.Student;
import com.tuespot.model.StudentModel;

public interface StudentService {
	
	public StudentModel saveStudent(StudentModel studentModel);
	
	List<Student> getAll(Long student_id);

	public Student assignCourseToStudent(Long studentId, Long courseId);
	
}
