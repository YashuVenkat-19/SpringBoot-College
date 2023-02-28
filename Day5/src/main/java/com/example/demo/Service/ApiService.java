package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Book;
import com.example.demo.Repository.BookRepo;


@Service
public class ApiService {
	@Autowired
	private BookRepo Bookrepo;
	
	public List<Book> getAll(){
		List<Book> s = new ArrayList<>();
		s = Bookrepo.findAll();
		return s;
	}
	
	public Optional<Book> getOneBook(int id) {
		return Bookrepo.findById(id);
	}
	
	public Book updateBook(int id) {
		Book s = Bookrepo.findById(id).get();		
		return Bookrepo.saveAndFlush(s);		
	}
	
	public void deleteBook(int id) {
		Bookrepo.deleteById(id);
	}
	
	public Book addBook(Book s) {
		return Bookrepo.save(s);
	}
}
