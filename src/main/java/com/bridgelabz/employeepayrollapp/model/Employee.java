package com.bridgelabz.employeepayrollapp.model;

import java.time.LocalDate;
import java.util.List;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
public @Data class Employee {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;
    private String name;
    private long salary;
    private String gender;
    private LocalDate starDate;
    private String note;
    private String profilePic;
    private List<String> department;

    public Employee(){};

    public Employee(String name, long salary, String gender, LocalDate starDate, String note, String profilePic, List<String> department) {
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.starDate = starDate;
        this.note = note;
        this.profilePic = profilePic;
        this.department = department;
    }
}
