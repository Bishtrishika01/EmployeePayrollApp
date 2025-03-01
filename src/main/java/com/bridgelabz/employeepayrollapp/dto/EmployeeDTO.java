package com.bridgelabz.employeepayrollapp.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;
import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmployeeDTO {
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee name Invalid")
    private String name;

    @Min(value = 10000, message = "Salary should be minimum 10,000")
    private double salary;

    @Pattern(regexp = "Male|Female", message = "Gender must be Male or Female")
    private String gender;

    @JsonFormat(pattern = "dd MM yyyy")
    @NotNull(message = "Start date should not be empty")
    @PastOrPresent(message = "Start date should be past or today's date")
    private LocalDate startDate;

    @NotBlank(message = "Note cannot be empty")
    private String note;

    @NotBlank(message = "Profile picture cannot be empty")
    private String profilePic;

    @NotNull(message = "Department cannot be empty")
    private String department;
}