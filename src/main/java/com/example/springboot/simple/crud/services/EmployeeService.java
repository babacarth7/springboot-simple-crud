package com.example.springboot.simple.crud.services;

import com.example.springboot.simple.crud.entities.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List <Employee> getAllEmployees();
    Optional<Employee> getEmployeeById(Long id);
    Employee saveOrUpdateEmployee(Employee employee);
    void deleteEmployee(Long id);
}
