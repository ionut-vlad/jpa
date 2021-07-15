package com.jpa.entity.shopping;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
	@Entity(name="shoppingOrder")
	public class ShoppingOrder{
		@Id
		@GeneratedValue
		@Column(name="order_id")
		public int orderId;
	
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "address_id")
		private ShippingAddress order;
		
		@OneToMany(
				mappedBy = "order",
				cascade = CascadeType.ALL,
				orphanRemoval = true
				)
		private List<OrderDetails> orderDetails;
	}
