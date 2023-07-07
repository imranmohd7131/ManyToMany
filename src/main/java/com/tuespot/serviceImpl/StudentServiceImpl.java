package com.tuespot.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tuespot.entity.Course;
import com.tuespot.entity.Student;
import com.tuespot.model.StudentModel;
import com.tuespot.repo.CourseRepository;
import com.tuespot.repo.StudentRepository;
import com.tuespot.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	CourseRepository courseRepository;

	@Override
	public StudentModel saveStudent(StudentModel studentModel) {

//		Long courses = studentModel.getCourses();
//
//		Course findById = this.courseRepository.findById(courses).get();
//		System.out.println("    " + findById);
		Student student = new Student();
		student.setName(studentModel.getName());
		Student save = this.studentRepository.save(student);

		StudentModel response = new StudentModel();
		response.setId(save.getId());
		response.setName(save.getName());

		return response;
	}

	@Override
	public List<Student> getAll(Long studentId) {
		if (studentId != null) {
			return this.studentRepository.findAllById(studentId);
		} else {
			return this.studentRepository.findAll();
		}
	}

	@Override
	public Student assignCourseToStudent(Long studentId, Long courseId) {
		List<Course> courseList=new ArrayList<>();
		Student student = this.studentRepository.findById(studentId).get();
		Course course = this.courseRepository.findById(courseId).get();
		courseList=student.getCourses();
		courseList.add(course);
		student.setCourses(courseList);
		return this.studentRepository.save(student);
	}

}
