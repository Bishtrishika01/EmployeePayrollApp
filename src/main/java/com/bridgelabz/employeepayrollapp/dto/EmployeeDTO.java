package com.bridgelabz.employeepayrollapp.dto;

import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import lombok.Data;
import lombok.ToString;
@Data
public @ToString class EmployeeDTO {
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",
            message = "Employee Name Invalid")
    private String name;

    @Min(value = 500,
            message = "Min Wage should be more than 500")
    private double salary;

    public String gender;

    public String startDate;

    public String note;

    public String profilePic;

    private List<String> department;
}