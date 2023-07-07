package com.tuespot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tuespot.entity.Course;
import com.tuespot.model.CourseModel;
import com.tuespot.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {

	@Autowired
	 private CourseService courseService;
	
//	@Autowired
//	StudentService studentService; 
	
	@PostMapping("/saveCourse")
	public ResponseEntity<?> saveCourse(@RequestBody CourseModel courseModel){
		CourseModel saveCourse = this.courseService.saveCourse(courseModel);
		return new ResponseEntity<CourseModel>(saveCourse,HttpStatus.CREATED);
	}
	
	@GetMapping(value={"/get","/{courseId}"})
	public ResponseEntity<?> get(@PathVariable(required = false) Long courseId) {
		List<Course> all = this.courseService.getAll(courseId);
		return new ResponseEntity<List<Course>>(all, HttpStatus.CREATED);
	}
}
