package com.example.Web_MVC_BookApp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Book {
	
	@Id
	private Integer id;
	private String author;
	private String name;
	private Double price;
	
	

}
