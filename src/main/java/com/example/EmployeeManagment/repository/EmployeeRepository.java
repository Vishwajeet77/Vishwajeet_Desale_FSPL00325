package com.example.EmployeeManagment.repository;


import com.example.EmployeeManagment.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {
}
