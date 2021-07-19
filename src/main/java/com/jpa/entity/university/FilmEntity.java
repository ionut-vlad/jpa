package com.jpa.entity.university;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class FilmEntity { 

	@Id
	@GeneratedValue
	private long id;

	@Column
	private String name;

	@Column
	private String genres;
	
	@Column
	private String director;
	
	@Column
	private String author;
	
	@Column
	private double budget;

}
