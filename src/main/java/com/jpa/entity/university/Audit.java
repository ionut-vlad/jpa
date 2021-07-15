package com.jpa.entity.university;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Audit {
	
	@Column(name = "updatedTime")
	private Date lastUpdateTime;
		
}
