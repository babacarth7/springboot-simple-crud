package com.example.springboot.simple.crud.repositiries;

import com.example.springboot.simple.crud.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
