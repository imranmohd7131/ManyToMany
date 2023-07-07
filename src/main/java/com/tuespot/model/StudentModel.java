package com.tuespot.model;

import java.util.List;

import javax.persistence.ManyToMany;

import com.tuespot.entity.Course;

public class StudentModel {

	private Long id;
	private String name;
	
	private Long courses;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getCourses() {
		return courses;
	}

	public void setCourses(Long courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "StudentModel [id=" + id + ", name=" + name + ", courses=" + courses + "]";
	}

	public StudentModel(Long id, String name, Long courses) {
		super();
		this.id = id;
		this.name = name;
		this.courses = courses;
	}

	public StudentModel() {
		super();
		// TODO Auto-generated constructor stub
	}
}
