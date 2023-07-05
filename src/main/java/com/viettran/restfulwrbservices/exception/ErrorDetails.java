package com.viettran.restfulwrbservices.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Getter
@RequiredArgsConstructor
public class ErrorDetails {
    private final LocalDateTime timestamp;
    private final String message;
    private final String details;
    
}
