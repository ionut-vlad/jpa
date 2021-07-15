package com.jpa.entity.shopping;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.jpa.entity.university.Audit;

import lombok.Data;

@Data
	@Entity(name="product")
	public class Product extends Audit{
	
		@Id
		@GeneratedValue
		@Column(name="product_id")
		private int productId;
		
		@Column(name="price")
		private float price;
	
		@Column(name="name")
		private String name;
		
		@OneToMany(
				mappedBy = "product",
				cascade = CascadeType.ALL,
				orphanRemoval = true
				)
		private List<OrderDetails> orderDetails;
	
	}
