package com.example.mayass;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}