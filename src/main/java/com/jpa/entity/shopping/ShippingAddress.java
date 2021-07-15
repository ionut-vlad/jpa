package com.jpa.entity.shopping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity(name="shippingAddress")
@Data
public class ShippingAddress {

	@Id
	@GeneratedValue
	@Column(name="address_id")
	private int addressId;
	
	@Column
	private String street;
	
	@Column
	private String postalCode;
}
