package com.ngantcb.EmployeeManagement.controller;

import com.ngantcb.EmployeeManagement.entity.Employee;
import com.ngantcb.EmployeeManagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @GetMapping(value = {"/", "/index", "/home"})
    public String index(Model model) {
        model.addAttribute("employees", service.getAllEmployees());
        return "index";
    }

    @GetMapping("/create")
    public String employee(Model model) {
        // form
        model.addAttribute("employee", new Employee());
        return "employee";
    }

    @PostMapping("/save")
    public String addEmployee(@ModelAttribute("employee") Employee employee,
                             BindingResult result, Model model) {
        service.save(employee);

        return "redirect:/";

    }

    @GetMapping("/employee/{id}")
    public String employee(@PathVariable Long id, Model model) {

        model.addAttribute("employee", service.getEmployeeById(id));

        return "employee";
    }
}
