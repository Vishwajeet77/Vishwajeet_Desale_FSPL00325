package com.example.EmployeeManagment.dto;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EmployeeDto {

    private String employeeName;
    private String email;
    private int age;
    private long mbno;
    private String address;
    private double doj;
    private double salary;

    private boolean isActive;
    private String createdBy;
    private LocalDateTime createdDate;
    private String updatedBy;
    private LocalDateTime  updated;
}
