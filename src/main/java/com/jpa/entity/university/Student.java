package com.jpa.entity.university;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import lombok.Data;

@Data
@Entity
public class Student {

	@Id
	@Column(name="SRL_NB")
	@GeneratedValue
	public Long serialNumber;

	@Column(name="CNP", nullable=false, 
			unique=true, length=13)
	public String CNP;
	
	@Column
	public String name;

	@Temporal(value = TemporalType.DATE)
	public Date birthDate;

	@Enumerated
	public GenderEnum gender;
	
	@Embedded
	@AttributeOverrides({
		  @AttributeOverride( name = "street", 
				 column = @Column(name = "street")),
		  @AttributeOverride( name = "postalCode", 
		  		 column = @Column(name = "postal_code")),
	})
	public Address address;
	
	@Transient
	public int getAge() { 
		return calculateAge(birthDate); 
	}

	public int calculateAge(Date birthDate) { 
		return -1;
	}


}
