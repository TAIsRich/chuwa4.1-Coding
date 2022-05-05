package com.example.useraccountproject.services;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT)
public class RecordExistedException extends Exception {
    public RecordExistedException(String message) {
        super(message);
    }
}
