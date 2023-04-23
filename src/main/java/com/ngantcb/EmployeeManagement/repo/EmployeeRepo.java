/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ngantcb.EmployeeManagement.repo;

import com.ngantcb.EmployeeManagement.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 *
 * @author baong
 */
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    
    Optional<Employee> findById(Long id);
}
