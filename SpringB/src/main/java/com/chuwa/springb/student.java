package com.chuwa.springb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class student {
    @GetMapping("/world")
    public String getname(){
        return "my name is Jay ";
    }
}
