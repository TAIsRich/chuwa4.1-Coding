package com.dfy.assignment0504.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 5/4/22 3:17 PM
 */

@ControllerAdvice
public class EmailExceptionAdvice {
    @ResponseBody
    @ExceptionHandler(EmailHasRegisteredException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    String userNotFoundHandler(EmailHasRegisteredException ex) {
        return ex.getMessage();
    }


}
