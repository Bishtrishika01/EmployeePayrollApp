package com.bridgelabz.employeepayrollapp.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "employee_payroll")
public @Data class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Long id;

    @Column(name = "name")
    private String name;

    private double salary;
    private String gender;

    @Column(name = "start_date")
    private LocalDate startDate;

    private String note;
    private String profilePic;

    private String department;
}
