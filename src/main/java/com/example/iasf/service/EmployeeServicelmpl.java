package com.example.iasf.service;

import com.example.iasf.entity.EmployeeEntity;
import com.example.iasf.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServicelmpl implements EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;
    @Override
    public List<EmployeeEntity>getAllEmployee(){
        return employeeRepo.findAll();
    }
    @Override
    public EmployeeEntity createEmployee(EmployeeEntity p){
        return  employeeRepo.save(p);
    }
}
