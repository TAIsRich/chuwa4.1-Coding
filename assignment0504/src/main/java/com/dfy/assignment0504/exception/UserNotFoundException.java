package com.dfy.assignment0504.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 5/4/22 9:50 AM
 */

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String message) {
        super(message);
    }


}
