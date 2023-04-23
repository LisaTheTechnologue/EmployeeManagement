package com.ngantcb.EmployeeManagement.repository;

import com.ngantcb.EmployeeManagement.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Serializable> {
}
