package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepo;

@Service
public class ApiService {
	@Autowired
	private StudentRepo studentrepo;
	
	public List<Student> getAll(){
		List<Student> s = new ArrayList<>();
		s = studentrepo.findAll();
		return s;
	}
	
	
	
	public Optional<Student> getOneStudent(int id) {
		return studentrepo.findById(id);
	}
	
	public Student updateStudent(int id) {
		Student s = studentrepo.findById(id).get();
		if((Objects.nonNull(s)) && (!(Objects.isNull(s.getDepartmentName()))))
		{
			s.setDepartmentName(s.getDepartmentName());
		}
		
		if((Objects.nonNull(s)) && (!(Objects.isNull(s.getStudentName()))))
		{
			s.setStudentName(s.getStudentName());
		}
		
		if((Objects.nonNull(s)) && (!(s.getId()==0)))
		{
			s.setId(s.getId());
		}
		
		return studentrepo.saveAndFlush(s);		
	}
	
	public void deleteStudent(int id) {
		studentrepo.deleteById(id);
	}
	
	public Student addStudent(Student s) {
		return studentrepo.save(s);
	}

}
