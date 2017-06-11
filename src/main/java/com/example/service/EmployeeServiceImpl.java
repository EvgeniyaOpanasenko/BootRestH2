package com.example.service;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository repository;

    @Override
    public Employee getEmployeeById(long id) {
        return repository.findOne(id);
    }

    @Override
    public List<Employee> getAllEmployees() {

        return repository.findAll();
    }

    @Override
    public void save(Employee employee) {
        repository.save(employee);
    }

}
