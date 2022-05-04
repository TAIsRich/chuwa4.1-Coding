package com.example.user.h2.exceptions;

public class UserAlreadyExistException extends RuntimeException{
    public UserAlreadyExistException (String message) {
        super(message);
    }
}
