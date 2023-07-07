package com.tuespot.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tuespot.entity.Course;
import com.tuespot.entity.Student;
import com.tuespot.model.CourseModel;
import com.tuespot.repo.CourseRepository;
import com.tuespot.repo.StudentRepository;
import com.tuespot.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	CourseRepository courseRepository;

//	@Override
//	public CourseModel saveCourse(CourseModel courseModel) {
//		Course course = new Course();
//		course.setCourseName(courseModel.getCourseName());
//		Course save = this.courseRepository.save(course);
//
//		CourseModel response = new CourseModel();
//		response.setId(save.getId());
//		response.setCourseName(save.getCourseName());
//
//		return courseModel;
//	}

	@Override
	public CourseModel saveCourse(CourseModel courseModel) {
//		Student findById = this.studentRepository.findById(courseModel.getId()).get();
		Course course = new Course();
		course.setCourseName(courseModel.getCourseName());
		Course save = this.courseRepository.save(course);

		CourseModel response = new CourseModel();
		response.setId(save.getId());
		response.setCourseName(save.getCourseName());
		return response;
	}

	@Override
	public List<Course> getAll(Long courseId) {
		if(courseId != null) {
			return this.courseRepository.findAllById(courseId);
		}
		else {
			return this.courseRepository.findAll();
		}
	}
}
