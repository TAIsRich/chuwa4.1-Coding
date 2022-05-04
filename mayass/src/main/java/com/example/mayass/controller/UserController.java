package com.example.mayass.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import java.util.List;
import java.util.stream.Collectors;

import com.example.mayass.entity.User;
import com.example.mayass.exceptions.UserNotFoundException;
import com.example.mayass.repository.UserRepository;
import com.example.mayass.service.UserSerive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.*;

// tag::hateoas-imports[]
// end::hateoas-imports[]

@RestController
public
class UserController {

    private UserSerive service;

    @Autowired
    UserController(UserSerive service) {
        this.service = service;
    }



    // tag::get-aggregate-root[]
    @GetMapping("/users")
    public CollectionModel<EntityModel<User>> all(){
        return service.all();
    }

    // end::get-aggregate-root[]

    @PostMapping("/users")
    User newUser(@RequestBody User newUser) {
        return service.saveUser(newUser);
    }

    // Single item

    // tag::get-singlUserNotFoundExceptione-item[]
    @GetMapping("/users/{id}")
    EntityModel<User> one(@PathVariable Long id){
        return service.one(id);
    }

    @GetMapping("/user")
    @ResponseBody
    EntityModel<User> two(@RequestParam Long account) {
        return service.two(account);
    }
    // end::get-single-item[]

    @PutMapping("/users/{id}")
    User replaceEmployee(@RequestBody User newUser, @PathVariable Long id) {

        return service.replace(newUser, id);
    }

    @DeleteMapping("/users/{id}")
    void deleteEmployee(@PathVariable Long id) {
        service.delete(id);
    }
}
