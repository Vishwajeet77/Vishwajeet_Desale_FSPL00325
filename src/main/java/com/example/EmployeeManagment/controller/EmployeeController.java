package com.example.EmployeeManagment.controller;

import com.example.EmployeeManagment.dto.EmployeeDto;
import com.example.EmployeeManagment.entity.EmployeeEntity;
import com.example.EmployeeManagment.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;


@RestController
@RequestMapping("/ems")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping ("/addData")
    public ResponseEntity<EmployeeEntity> addData(@RequestBody EmployeeDto employeeDto)

    {
        return new ResponseEntity<>(employeeService.addData(employeeDto), CREATED);
    }
}
