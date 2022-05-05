package com.example.assignment_5.exception;

public class UserExistsException extends RuntimeException {
    public UserExistsException(String userName) {
        super(String.format("Sorry this user already exists: ", userName));
    }
}
