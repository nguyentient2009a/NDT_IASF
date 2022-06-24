package com.example.iasf.service;

import com.example.iasf.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    List<EmployeeEntity> getAllEmployee();
    EmployeeEntity createEmployee(EmployeeEntity employee);

}
