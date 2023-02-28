package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Child;
import com.example.demo.Repository.ChildRepo;

@Service
public class ApiService {
	
	@Autowired 
	private ChildRepo child;
	
	public Child addChild(Child c) {
		return child.save(c);
	}
	
	public List<Child> getAll(){
		return child.findAll();
	}
	
	public Page<Child> getChildWithPage(int m,int n){
		Pageable page = PageRequest.of(m,n);
		return child.findAll(page);
	}
	
	public Page<Child> getChildWithPageAndSort(int m,int n,String field){
		Pageable page = PageRequest.of(m, n,Sort.by(field));
		return child.findAll(page);
	}
	
	public List<Child> sortChild(String field){
		List<Child> c = child.findAll(Sort.by(field));
		return c;
	}
}
