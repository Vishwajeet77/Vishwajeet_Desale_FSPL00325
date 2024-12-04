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
@Table(name = "Designation")

public class Designation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long designationId;
    private String designationName;

    private boolean isActive;
    private String createdBy;
    private LocalDateTime createdDate;
    private String updatedBy;
    private LocalDateTime  updated;
}
