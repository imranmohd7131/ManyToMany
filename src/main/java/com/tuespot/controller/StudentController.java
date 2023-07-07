package com.tuespot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tuespot.entity.Student;
import com.tuespot.model.StudentModel;
import com.tuespot.service.CourseService;
import com.tuespot.service.StudentService;

@RestController
@RequestMapping("/Student")
public class StudentController {

//	@Autowired
//	CourseService courseService;

	@Autowired
	StudentService studentService;

	@PostMapping("/saveStudent")
	public ResponseEntity<?> saveStudent(@RequestBody StudentModel studentModel) {
		StudentModel saveStudent = this.studentService.saveStudent(studentModel);
		return new ResponseEntity<StudentModel>(saveStudent, HttpStatus.CREATED);
	}

	@GetMapping(value={"/get","/{studentId}"})
	public ResponseEntity<?> get(@PathVariable(required = false) Long studentId) {
		List<Student> all = this.studentService.getAll(studentId);
		return new ResponseEntity<List<Student>>(all, HttpStatus.CREATED);
	}
	
	
	@PutMapping("/{studentId}/course/{courseId}")
	public Student assignCourseToStudent(@PathVariable Long studentId,
			@PathVariable Long courseId) {
		return studentService.assignCourseToStudent(studentId,courseId);
	}
	
}
