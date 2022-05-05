package com.example.springboot.demo.userRegistration.exception;

public class UserExistException extends Exception{

    public UserExistException(String message) {
        super(message);
    }
}
