package com.jpa.entity.shopping;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data

	
	@Embeddable
	public class OrderDetailsId implements Serializable{
		@Column(name="order_id")
		public int orderId;
		
		@Column(name="product_id")
		public int productId;
	}
