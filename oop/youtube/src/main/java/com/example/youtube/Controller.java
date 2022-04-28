package com.example.youtube;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class Controller {

    private static final String template = "Title: %s , Length: %s , Description: %s , Year: %d\n";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/")
    public String index() {
        return "Welcome to Youtube!";
    }

    @GetMapping("/signin")
    public String signin(@RequestParam(name="name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "Signin successfully";
    }
    @GetMapping("/movies")
    public ArrayList MovieList(@RequestParam(value="One Day") String name) {

        ActionList a = new ActionList();
        for (Object obj : a.contentOfList()) {
            //if(obj.equals("One Day")){
              //  return obj;
            //}
            System.out.println(obj);
        }
        return null;

    }

    @GetMapping("/users")
    public ArrayList UserList() {
        ActionList a = new ActionList();
        for(Object obj : a.userOfList()) {
            return (ArrayList) obj;
        }
        return null;
    }


}
