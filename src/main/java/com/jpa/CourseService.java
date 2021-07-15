package com.jpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.entity.university.Course;
import com.jpa.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	CourseRepository courseRepository;

	public void createCourseWithName(String name) {
		courseRepository.save(new Course().setName(name));
		
		courseRepository.findByName(name);
	}
	
		
}
