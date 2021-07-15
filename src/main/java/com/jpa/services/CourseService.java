package com.jpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.entity.university.CourseEntity;
import com.jpa.repository.CourseRepository;

@Service
public class CourseService {
    
    @Autowired
    CourseRepository courseRepo;
    
    public List<CourseEntity> getAllCourses() {
        return courseRepo.findAll();
    }
    
    public void createCourseWithName(String name) {
        courseRepo.save(new CourseEntity().setName(name));
        courseRepo.findByNameIgnoreCase(name);
    }

    public CourseEntity getCourseByName(String courseName) {
        return courseRepo.findByNameIgnoreCase(courseName);
    }
}
