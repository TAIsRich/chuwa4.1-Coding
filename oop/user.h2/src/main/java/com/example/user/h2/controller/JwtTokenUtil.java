package com.example.user.h2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
//https://www.javainuse.com/spring/boot-jwt

@Component
public class JwtTokenUtil implements Serializable{
    private static final long serialVersionUID = -2550902121861291930L;
    public static final long JWT_TOKEN_VALIDITY = 5*60*60;


    private String secret;

    public String getUsernameFromToken(String token){
        return getClaimFromToken(token, Claims::getExpiration);
    }


}
