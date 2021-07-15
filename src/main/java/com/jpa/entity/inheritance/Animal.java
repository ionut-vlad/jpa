package com.jpa.entity.inheritance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Data;

@Data

	@Entity
	@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
	public abstract class Animal {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		public int id;
		
		@Column
		public int age;
	}
