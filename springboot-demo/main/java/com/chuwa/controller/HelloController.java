package com.chuwa.controller;


import com.chuwa.domain.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {


    @RequestMapping("test/{id}/{name}/{password}")
    public User test(@PathVariable("id") Integer id,
                       @PathVariable("name") String name,
                       @PathVariable("password") String password){
        return new User(id,name,password);

    }
}
