package com.ngantcb.EmployeeManagement.controller;

import com.ngantcb.EmployeeManagement.entity.Employee;
import com.ngantcb.EmployeeManagement.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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

    @PostMapping("/create")
    public String addEmployee(@ModelAttribute("employee") @Valid Employee employee,
                              Model model) {
        try {
            service.save(employee);
        } catch (Exception ex) {
            model.addAttribute("error", "failed");
            return "create";
        }
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable(value = "id") Long id, Model model) {
        try {
            service.delete(id);
        } catch (Exception ex) {
            model.addAttribute("error", "failed");
            model.addAttribute("employees", service.getAll());
            return "index";
        }
        return "redirect:/";
    }

    @GetMapping("/details/{id}")
    public String getEmployeeById(@PathVariable(value = "id") Long id, Model model) {
        Employee employee = service.get(id);
        model.addAttribute("emp", employee);
        return "details";
    }
}
