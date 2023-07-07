package com.tuespot.model;

import java.util.List;

import javax.persistence.ManyToMany;

import com.tuespot.entity.Student;

public class CourseModel {

	private Long id;
	private String courseName;
	
	private List<Student> students;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "CourseModel [id=" + id + ", courseName=" + courseName + ", students=" + students + "]";
	}

	public CourseModel(Long id, String courseName, List<Student> students) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.students = students;
	}

	public CourseModel() {
		super();
		// TODO Auto-generated constructor stub
	}

}
