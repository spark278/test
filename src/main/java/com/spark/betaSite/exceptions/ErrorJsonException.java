package com.spark.betaSite.exceptions;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ErrorJsonException {

    private HttpStatus httpStatus;
    private String message;

    public ErrorJsonException(HttpStatus httpStatus, String message) {
        this.httpStatus = httpStatus;
        this.message = message;
    }
}
