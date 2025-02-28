package com.bridgelabz.employeepayrollapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.bridgelabz.employeepayrollapp.repository")
public class EmployeePayrollAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(EmployeePayrollAppApplication.class, args);
	}
}

