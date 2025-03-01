package com.bridgelabz.employeepayrollapp.exception;

public class EmployeeNotFoundExceptionHandler extends RuntimeException {
    public EmployeeNotFoundExceptionHandler(String message) {
        super(message);
    }
}