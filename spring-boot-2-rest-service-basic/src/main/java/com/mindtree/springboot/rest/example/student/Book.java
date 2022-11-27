package com.mindtree.springboot.rest.example.student;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Book {

	private int id;
	
	private String name;
	
	private String publication;
}
