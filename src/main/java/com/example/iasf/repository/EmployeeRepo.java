package com.example.iasf.repository;

import com.example.iasf.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity , Integer> {
    EmployeeEntity findByName(String name);
    @Query("select p from EmployeeEntity p where p.name like %:name%")
    List<EmployeeEntity> findEmployeeByNameCustom(String name);
}
