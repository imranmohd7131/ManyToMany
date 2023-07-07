package com.tuespot.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tbl_course")
public class Course {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private Long id;
	private String courseName;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "courses")
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
		return "Course [id=" + id + ", courseName=" + courseName + ", students=" + students + "]";
	}

	public Course(Long id, String courseName, List<Student> students) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.students = students;
	}

	public Course() {
		super();
	}
	
}
