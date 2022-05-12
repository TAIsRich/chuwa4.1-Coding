package com.chuwa.payload;

import lombok.Data;

@Data
public class LoginDto {

    private String usernameOremail;
    private String password;
}
