package com.ems.Nitin_Choudhary_BED_LAB5.service.impl;



import com.ems.Nitin_Choudhary_BED_LAB5.entity.Employee;
import com.ems.Nitin_Choudhary_BED_LAB5.repository.EmployeeRepository;
import com.ems.Nitin_Choudhary_BED_LAB5.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
    private EmployeeRepository employeeRepository;
   
    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
    
    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    
    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).get();
    }


    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    
    @Override
    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
    }

    
}
