package com.example.day3.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day3.Entity.Employee;
import com.example.day3.Service.EmployeeService;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService empService;

    @PostMapping("/addemployee")
    public Employee addEmployee(@RequestBody Employee emp) {
        return empService.addEmployeeDetails(emp);
    }

    @GetMapping("/")
    public List<Employee> getEmployee() {
        return empService.getEmployeeDetails();
    }

    @GetMapping("/{id}")
    public Optional<Employee> getOneEmployee(@PathVariable("id") int id) {
        return empService.getOneEmployeeDetails(id);
    }
}
