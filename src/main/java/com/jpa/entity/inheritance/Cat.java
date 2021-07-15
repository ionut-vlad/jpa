package com.jpa.entity.inheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data

	@Entity
	public class Cat extends Animal{
		@Column
		public boolean purrs;
	}
