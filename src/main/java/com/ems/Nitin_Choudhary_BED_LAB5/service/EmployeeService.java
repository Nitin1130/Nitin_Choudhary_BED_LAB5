package com.ems.Nitin_Choudhary_BED_LAB5.service;



import com.ems.Nitin_Choudhary_BED_LAB5.entity.Employee;

import java.util.List;

public interface EmployeeService {
		
	List<Employee> getAllEmployees();
	
	Employee saveEmployee(Employee employee);
	
	Employee getEmployeeById(Long id);
	   
	Employee updateEmployee(Employee employee);

	void deleteEmployeeById(Long id);

}
