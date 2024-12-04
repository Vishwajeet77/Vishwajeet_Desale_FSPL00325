package com.example.EmployeeManagment.service;

import com.example.EmployeeManagment.dto.EmployeeDto;
import com.example.EmployeeManagment.entity.EmployeeEntity;
import com.example.EmployeeManagment.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public EmployeeEntity addData(EmployeeDto employeeDto){
        EmployeeEntity employeeEntity =new EmployeeEntity();
        employeeEntity.setEmployeeID(0L);
        employeeEntity.setEmployeeName(employeeEntity.getEmployeeName());
        employeeEntity.setEmail(employeeDto.getEmail());
        employeeEntity.setActive(true);
        employeeEntity.setCreatedBy(employeeDto.getCreatedBy());
        employeeEntity.setCreatedDate(LocalDateTime.now());
        employeeEntity.setUpdatedBy(employeeDto.getUpdatedBy());
        employeeEntity.setUpdatedDate(LocalDateTime.now());
        return employeeRepository.save(employeeEntity);

    }
}