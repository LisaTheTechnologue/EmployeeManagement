package com.ngantcb.EmployeeManagement.service;

import com.ngantcb.EmployeeManagement.entity.Employee;
import com.ngantcb.EmployeeManagement.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeService {

    @Autowired
    private final EmployeeRepo employeeRepo;

    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public List<Employee> getAllEmployees() {
        List<Employee> employees = employeeRepo.findAll();
        if (employees != null) {
            return employees;
        } else {
            return null;
        }
    }

    public Employee getEmployeeById(Long categoryId) {
        try {
            Employee employee = employeeRepo.findById(categoryId).get();
            return employee;
        } catch (Exception e) {
            return null;
        }
    }

    public Employee save(Employee employee) {
        return employeeRepo.save(employee);
    }
}
