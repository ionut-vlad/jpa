package com.jpa.entity.university;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data

@Embeddable
public class BookId implements Serializable{
	
	public String authorName;	
	public String bookTitle;
}
