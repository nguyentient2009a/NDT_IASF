package com.example.iasf.controller;

import com.example.iasf.entity.EmployeeEntity;
import com.example.iasf.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

public class WebController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping({"/", "/index"})
    public String index(Model model) {
        List<EmployeeEntity> employeeEntities = employeeService.getAllEmployee();
        model.addAttribute("employee", employeeEntities);
        return "index";
    }
    @PostMapping("/create")
    public String createEmployee(Model model, @RequestParam Map<String, String> params){
        System.out.println(params);
        String name =params.get("name");
        String wage = params.get("wage");
        EmployeeEntity employee = new EmployeeEntity(name, wage);
        employeeService.createEmployee(employee);
        return "redirect:/index";

    }
}
