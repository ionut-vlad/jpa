package com.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jpa.entity.university.CourseEntity;

@Repository
public interface CourseRepository extends JpaRepository<CourseEntity, Long> {

	public CourseEntity findByNameIgnoreCase(String name);
	
	public CourseEntity findByTeacher(String teacher);
	
	@Query(nativeQuery = true, value = "Select * FROM COURSE_ENTITY WHERE id = 1")
	public CourseEntity findByMyRandomValue(int value);
	
}
