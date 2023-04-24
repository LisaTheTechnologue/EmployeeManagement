package com.ngantcb.EmployeeManagement.service;

import com.ngantcb.EmployeeManagement.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAll();

    public Employee save(Employee employee);

    public Employee get(Long id);

    void delete(Long id);
}
