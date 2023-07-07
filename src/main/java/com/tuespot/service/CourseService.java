package com.tuespot.service;

import java.util.List;

import com.tuespot.entity.Course;
import com.tuespot.model.CourseModel;

public interface CourseService {
	
	public CourseModel saveCourse(CourseModel courseModel);

	List<Course> getAll(Long courseId);
}
