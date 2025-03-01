package com.bridgelabz.employeepayrollapp.dto;

import lombok.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTOforError {
    private String message;
    private String details;
    private LocalDateTime timestamp;

    public ResponseDTOforError(String message, String details) {
        this.message = message;
        this.details = details;
        this.timestamp = LocalDateTime.now();
    }
}
