package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Employee;
//JpaReporitory<Entity cha Nav , Primary Key cha type > 

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
