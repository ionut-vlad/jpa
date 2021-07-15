package com.jpa.entity.university;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Course { 

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long id;

	@Column
	public String name;


}