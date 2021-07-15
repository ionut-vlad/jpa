package com.jpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@Autowired
	CourseService courseService;
	
	@GetMapping(value="/create", produces ="application/json") 
	public String createObject(){ 
		courseService.createCourseWithName("name");
		return "random";
	}
	
}
