package com.bridgelabz.employeepayrollapp.exception;

import com.bridgelabz.employeepayrollapp.dto.ResponseDTOforError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import java.time.LocalDateTime;

@ControllerAdvice
public class EmployeePayrollExceptionHandler {

    @ExceptionHandler(EmployeeNotFoundExceptionHandler.class)
    public ResponseEntity<ResponseDTOforError> handleEmployeeNotFoundException(EmployeeNotFoundExceptionHandler ex) {
        ResponseDTOforError response = new ResponseDTOforError(
                ex.getMessage(), "Employee ID not found", LocalDateTime.now());
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ResponseDTOforError> handleGlobalException(Exception ex) {
        ResponseDTOforError response = new ResponseDTOforError(
                ex.getMessage(), "Unexpected error occurred", LocalDateTime.now());
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
