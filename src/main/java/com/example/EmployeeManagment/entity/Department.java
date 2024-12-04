package com.example.EmployeeManagment.entity;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDateTime;
import lombok.Data;

@Data
@Entity
@Table(name = "Department")

public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long deptId;
    private String deptName;

    private boolean isActive;
    private String createdBy;
    private LocalDateTime createdDate;
    private String updatedBy;
    private LocalDateTime  updated;
}
