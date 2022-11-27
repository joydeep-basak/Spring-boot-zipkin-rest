package com.mindtree.springboot.rest.example.student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookResource {
	static List<Book> studentRepository;

    static {
    	studentRepository= new ArrayList<Book>();
    	studentRepository.add(Book.builder().id(1).name("Book1").publication("pub1").build());
    	studentRepository.add(Book.builder().id(2).name("Book2").publication("pub2").build());
    	studentRepository.add(Book.builder().id(3).name("Book3").publication("pub3").build());
    }

    @GetMapping("/books")
    public List<Book> retrieveAllStudents() {
        return studentRepository;
    }
    
}
