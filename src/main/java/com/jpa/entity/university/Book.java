package com.jpa.entity.university;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

import lombok.Data;


@Data
@Entity(name="book")
public class Book {
	
	@Id
	@GeneratedValue
	public int id;
	
	@Column
	public String author;

	@Column
	public String title;

	@Column
	public String gendre;
	    
	
	//ONE TO MANY
	@OneToMany(cascade = CascadeType.ALL, 
			mappedBy="book",
			orphanRemoval = true,
			fetch = FetchType.LAZY)
	public List<BookDetails> bookDetails;

	public void addBookDetails(BookDetails details) {
		if (this.bookDetails == null) { 
			this.bookDetails = new ArrayList();
		} 
		bookDetails.add(details);
		details.setBook(this);
	}

	public void removeBookDetails( BookDetails details) {
		bookDetails.remove(details);
		details.setBook(null);
	}

}
