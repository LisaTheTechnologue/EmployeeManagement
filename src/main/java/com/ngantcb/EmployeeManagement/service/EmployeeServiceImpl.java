package com.ngantcb.EmployeeManagement.service;
import com.ngantcb.EmployeeManagement.entity.Employee;
import com.ngantcb.EmployeeManagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    @Override
    public List<Employee> getAll() {
        return repo.findAll();
    }

    @Override
    public Employee get(Long employeeId) {
        return repo.findById(employeeId).get();
    }

    @Override
    public Employee save(Employee employee) {
        return repo.save(employee);
    }

    @Override
    public void delete(Employee employee) {
        repo.delete(employee);
    }
}