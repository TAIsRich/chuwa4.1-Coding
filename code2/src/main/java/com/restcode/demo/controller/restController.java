package com.restcode.demo.controller;

import com.restcode.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;

@RestController
public class restController {

    @Resource
    private UserRepository userRepository;

    //ex.@GetMapping(path="/employees", produces = "application/json")
    @GetMapping(path="/employees", produces = "application/json")
    public String Hello(){
        return "Hello YI ~~~~~~!!!!!!";
    }

    //ex.@PostMapping(path="/employee", produces = "application/json",consumes = "application/json")
    @PostMapping(path="/employee", produces = "application/json",consumes = "application/json")
    public  void Login(String name){

    }


    @GetMapping("/employees/{id}")
    @ResponseBody
    public String getId(@PathVariable String id){
        return "id" + id;
    }

    @GetMapping("/hi/{id}")
    @ResponseBody
    public String getEmployID(@PathVariable("id") String empliyeeid){//@PathVariable(value=”id”) instead of PathVariable(“id”)
        return "id" + empliyeeid;
    }

    @GetMapping("/hi/employee/{id}/{loginName}")
    @ResponseBody
    public String  getInfo(@PathVariable("id") Long id, @PathVariable("name") String loginName){
        return "HI !!!" + loginName +" your id is : " + id;
    }
}
