package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Book;
import com.example.demo.Service.ApiService;

@RestController
public class ApiController {
	
	@Autowired
	private ApiService bookservice;
	
	@GetMapping("/")
	public List<Book> getAll() {
		return bookservice.getAll();
	}
	
	@PostMapping("/")
	public Book putBook(@RequestBody Book s) {
		return bookservice.addBook(s);
	}
	
	@GetMapping("/{id}")
	public Optional<Book> getOneBook(@PathVariable int id) {
		return bookservice.getOneBook(id);
	}
	
	@PutMapping("/{id}")
	public Book putBook(@PathVariable int id) {
		return bookservice.updateBook(id);
	}
	@DeleteMapping("/{id}")
	public void delBook(@PathVariable int id) {
		bookservice.deleteBook(id);
	}

}

