package com.dfy.assignment0504.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 5/4/22 12:25 PM
 */

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class EmailHasRegisteredException extends RuntimeException {

    public EmailHasRegisteredException() {
        super("The email has been used for registration");
    }

}
