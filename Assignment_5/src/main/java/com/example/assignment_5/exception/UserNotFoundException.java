package com.example.assignment_5.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String userName) {
        super(String.format("Sorry this user is not found: ", userName));
    }
}
