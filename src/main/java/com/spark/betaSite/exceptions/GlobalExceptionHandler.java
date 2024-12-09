package com.spark.betaSite.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ErrorJsonException> haldeException(ResourceNotFoundException e) {
        return new ResponseEntity<>(new ErrorJsonException(HttpStatus.NOT_FOUND, e.getMessage()), HttpStatus.NOT_FOUND);
    }
}
