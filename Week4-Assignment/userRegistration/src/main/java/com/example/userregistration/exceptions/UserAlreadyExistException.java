package com.example.userregistration.exceptions;

public class UserAlreadyExistException extends RuntimeException{
    public UserAlreadyExistException (String message){
        super(message);
    }
}
