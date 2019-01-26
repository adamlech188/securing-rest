package com.mragowo.securing.rest.model;

import java.util.List;

import lombok.Data;

@Data
public class Course {
	private String id;
	private String name;
	private String description;
	private List<String> steps;
	public Course(String id, String name, String description, List<String> steps) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.steps = steps;
	}
	
	
	
}