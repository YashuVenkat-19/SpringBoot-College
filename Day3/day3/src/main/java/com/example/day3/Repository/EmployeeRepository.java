package com.example.day3.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day3.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
