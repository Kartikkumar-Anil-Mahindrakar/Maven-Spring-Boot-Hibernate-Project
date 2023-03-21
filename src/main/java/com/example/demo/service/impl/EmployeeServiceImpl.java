package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;

@Service
//No need to write Transaction Annotation	
public class EmployeeServiceImpl implements EmployeeService {
		
	private EmployeeRepository employeeRepository;
	
	// Dependency Injection using Constructor injection
	// There is not need of adding @Autowired here because spring will automatically check and because this is the only constructor using dependency
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}


	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}


	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}


	@Override
	public Employee getEmployeeById(long id) {
//		Optional<Employee> employee =  employeeRepository.findById(id);
//		if(employee.isPresent()) {
//			return employee.get();
//		}else {
//			throw new ResourceNotFoundException("Employee", "Id", id);
//		}
		return employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee", "Id", id));
		
	}


	@Override
	public Employee updateEmploye(Employee employee, long id) {
		//we need to check whether employee with given id is exist in db or not
		Employee existingEmployee = employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee", "Id", id));
		
		existingEmployee.setEmail(employee.getEmail());
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		//save existing employee to db
		
		employeeRepository.save(existingEmployee);
		
		return existingEmployee;
	}


	@Override
	public void deleteEmployee(long id) {
		
//		
//		Employee employee = employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee", "Id", id));
//		
//		employeeRepository.delete(employee);.
		
		employeeRepository.deleteById(id);
		
	}

}
