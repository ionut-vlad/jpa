package com.jpa.entity.university;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity(name="bookDetails")
public class BookDetails {
	@Id
	@GeneratedValue
	public  int detailsId;
	
	@Column
	public String description;

	@ManyToOne(fetch=FetchType.LAZY)
	public Book book;
	
		//v2
//		@OneToOne
//		@MapsId("book_id")
//		public Book book;
	}
	
	


