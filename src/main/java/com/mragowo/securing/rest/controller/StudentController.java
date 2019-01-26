package com.mragowo.securing.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mragowo.securing.rest.model.Course;
import com.mragowo.securing.rest.service.StudentService;

@RestController
public class StudentController {

	private StudentService studentService; 
	
	@Autowired
	public StudentController(StudentService studentService) {
		this.studentService = studentService; 
	}
	
	@GetMapping("/students/{studentId}/courses")
	public List<Course> retrieveCourseForStudent(@PathVariable String studentId){
		
		return studentService.retrieveCourses(studentId);
	}
}
