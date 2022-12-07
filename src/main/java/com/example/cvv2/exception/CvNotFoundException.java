package com.example.cvv2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CvNotFoundException extends RuntimeException{

    public CvNotFoundException(String message) {
        super(message);
    }
}
