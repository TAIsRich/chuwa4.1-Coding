package com.chuwa.demo.controller;

import com.chuwa.demo.entity.User;
import com.chuwa.demo.service.NotifyService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NotifyController {

    private NotifyService notifyService;

    @Autowired
    public NotifyController(NotifyService notifyService){
        this.notifyService= notifyService;
    }

    @RequestMapping(value = "/notify", method = RequestMethod.GET)
    public void notify(List<User> userList){
        notifyService.notifyAll();
    }

    @GetMapping(value = "/email")
    public List<User> findByEmail(@RequestParam(name = "email") String username) {
        return notifyService.findByEmail();
    }
    @GetMapping(value = "/sms")
    public List<User> findBySMS(@RequestParam(name = "sms") String username) {
        return notifyService.findBySMS();
    }

    @GetMapping(value = "/email/{userId}")
    public User findByUserId(@PathVariable Long userId) {
        return notifyService.findByUserId(userId);
    }

}
