package com.example.mayass.exceptions;

public class PasswordNotMatch extends RuntimeException{
    public PasswordNotMatch(Long id, String password){
        super(id + "'s password " + password + " Password does not match record.");
    }
}
