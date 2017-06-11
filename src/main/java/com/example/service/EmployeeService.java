package com.example.service;

import com.example.model.Employee;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EmployeeService {
    Employee getEmployeeById(long id);
    List<Employee> getAllEmployees();
    void save(Employee employee);

}
