package com.example.user.h2.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {
    private String resourceName;
    private String fieldName;
    private Object fieldValue;

    public UserNotFoundException(String resourceName, String fieldName, Object fieldValue) {
        super(String.format("%s not found with %s : %s", resourceName, fieldName, fieldValue));
    }

    public UserNotFoundException(String user_not_found, String id) {
        super(String.format("%s not found with %s"));
    }

    public String getResourceName(String resourceName) { return resourceName; }
    public String getFieldName(String fieldName) {return fieldName; }
    public String getFieldValue(String fieldValue) { return fieldValue; }
}