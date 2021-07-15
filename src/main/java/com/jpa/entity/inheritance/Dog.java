package com.jpa.entity.inheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;

@Data

	@Entity
	public class Dog extends Animal{
		@Column
		public boolean bites;
	}
