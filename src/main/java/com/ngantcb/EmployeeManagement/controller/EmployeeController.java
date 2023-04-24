package com.ngantcb.EmployeeManagement.controller;

import com.ngantcb.EmployeeManagement.entity.Employee;
import com.ngantcb.EmployeeManagement.repository.EmployeeRepository;
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
        model.addAttribute("employees", service.getAll());
        return "index";
    }

    @GetMapping("/create")
    public String employee(Model model) {
        // form
        model.addAttribute("employee", new Employee());
        return "create";
    }

    @PostMapping("/save")
    public String addEmployee(@ModelAttribute("employee") Employee employee) {
        service.save(employee);
        return "redirect:/";

    }

    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable(value = "id") Long id) {
        service.delete(id);
        return "redirect:/";
    }
    @GetMapping("/details/{id}")
    public String getEmployeeById(@PathVariable(value = "id") Long id,Model model) {
        Employee employee = service.get(id);
        model.addAttribute("emp", employee);
        return "details";
    }
}
