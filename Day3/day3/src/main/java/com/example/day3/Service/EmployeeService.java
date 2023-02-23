package com.example.day3.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day3.Entity.Employee;
import com.example.day3.Repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employee;

    public Employee addEmployeeDetails(Employee emp) {
        return employee.save(emp);
    }

    public List<Employee> getEmployeeDetails() {
        List<Employee> arr = new ArrayList<>();
        arr = employee.findAll();
        return arr;
    }

    public Optional<Employee> getOneEmployeeDetails(int id) {
        // List<Employee> arr2 = new ArrayList<>();
        // arr2 = employee.findById(id);
        return employee.findById(id);
    }
}
