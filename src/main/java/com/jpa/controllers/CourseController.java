package com.jpa.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.entity.university.CourseEntity;
import com.jpa.services.CourseService;

@RestController
public class CourseController {

	@Autowired
	CourseService courseService;
	
	@GetMapping(value="/create", produces ="application/json") 
	public String createObject(){ 
		courseService.createCourseWithName("name");
		return "random";
	}
	
	@GetMapping(value = "/getAllCourses")
	public List<CourseEntity> getAllCourses() {
	    return courseService.getAllCourses();
	}
	

    @GetMapping(value = "/getCourseByName/{courseName}")
    public CourseEntity getCourseByName(@PathVariable String courseName) {
        return courseService.getCourseByName(courseName);
    }
	
}
