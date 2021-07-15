package com.jpa.entity.shopping;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import lombok.Data;

@Data
@Entity
public class OrderDetails{

	@EmbeddedId
	public OrderDetailsId id;

	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("order_id")
	@JoinColumn(name = "order_id")
	private ShoppingOrder order;

	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("product_id")
	@JoinColumn(name = "product_id")
	private Product product;
	
	@Column(name="items")
	private int items;

	@Column(name = "created_on")
	private Date createdOn = new Date();
}
