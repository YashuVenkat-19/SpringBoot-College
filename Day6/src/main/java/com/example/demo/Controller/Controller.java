package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Child;
import com.example.demo.Service.ApiService;

@RestController
public class Controller {
	
	@Autowired
	private ApiService childservice;
	
	@PostMapping("/addChild")
	public Child addChild(@RequestBody Child c) {
		return childservice.addChild(c);
	}
	
	@GetMapping("/{offset}/{pagesize}")
	public Page<Child> getPage(@PathVariable("offset") int m,@PathVariable("pagesize") int n){
		return childservice.getChildWithPage(m, n);
	}
	
	@GetMapping("/{offset}/{pagesize}/{field}")
	public Page<Child> getPageAndSort(@PathVariable("offset") int m,@PathVariable("pagesize") int n,@PathVariable("field") String field){
		return childservice.getChildWithPageAndSort(m, n,field);
	}
	
	@GetMapping("/{field}")
	public List<Child> sortChild(@PathVariable("field") String field){
		return childservice.sortChild(field);
	}
	
	@GetMapping("/getAll")
	public List<Child> getAll(){
		return childservice.getAll();
	}
	
	
}
