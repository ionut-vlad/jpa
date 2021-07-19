package com.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jpa.entity.university.FilmEntity;

@Repository
public interface FilmRepository extends JpaRepository<FilmEntity, Long> {

public FilmEntity findByNameIgnoreCase(String name);
	
	public FilmEntity findByGenres(String genres);
	
	public FilmEntity findByDirector(String director);
	
	public FilmEntity findByAuthor(String author);
	
	public FilmEntity findByBudget(float budget);
	
	public FilmEntity findByNameAndDirector(String name, String director) ;
	
	@Query(nativeQuery = true, value = "Select * FROM FILM_ENTITY WHERE id = 1")
	public FilmEntity findByMyRandomValue(int value);

	
}
