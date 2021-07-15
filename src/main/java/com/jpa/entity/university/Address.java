package com.jpa.entity.university;

import javax.persistence.Embeddable;

import lombok.Data;

@Data


@Embeddable
public class Address {
	public String street;
	public String postalCode;
}
