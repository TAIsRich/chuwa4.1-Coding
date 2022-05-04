package com.example.mayass.service;

import com.example.mayass.controller.UserController;
import com.example.mayass.entity.User;
import com.example.mayass.exceptions.PasswordNotMatch;
import com.example.mayass.exceptions.UserNotFoundException;
import com.example.mayass.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Service
public class UserSerive {
    private UserRepository repository;

    @Autowired
    public UserSerive(UserRepository repository){
        this.repository = repository;
    }

    public CollectionModel<EntityModel<User>> all() {

        List<EntityModel<User>> users = repository.findAll().stream()
                .map(user -> EntityModel.of(user,
                        linkTo(methodOn(UserSerive.class).one(user.getId())).withSelfRel(),
                        linkTo(methodOn(UserSerive.class).all()).withRel("users")))
                .collect(Collectors.toList());

        return CollectionModel.of(users, linkTo(methodOn(UserSerive.class).all()).withSelfRel());
    }

    public boolean ValidatePassword(Long id, String password){
        User user = repository.findById(id) //
                .orElseThrow(() -> new UserNotFoundException(id));
        if (user.getPassword().equals(password)) {
            return true;
        }
        return false;
    }

    public EntityModel<User> one(Long id) {

        User user = repository.findById(id) //
                .orElseThrow(() -> new UserNotFoundException(id));

        return EntityModel.of(user, //
                linkTo(methodOn(UserSerive.class).one(id)).withSelfRel(),
                linkTo(methodOn(UserSerive.class).all()).withRel("users"));
    }

    public User saveUser(User newUser){
        return repository.save(newUser);
    }

    public EntityModel<User> two(@RequestParam Long account) {

        User user = repository.findById(account) //
                .orElseThrow(() -> new UserNotFoundException(account));

        return EntityModel.of(user, //
                linkTo(methodOn(UserSerive.class).one(account)).withSelfRel(),
                linkTo(methodOn(UserSerive.class).all()).withRel("employees"));
    }

    public User replace(User newUser, Long id){
        return repository.findById(id) //
                .map(user -> {
                    user.setName(newUser.getName());
                    user.setRole(newUser.getRole());
                    return repository.save(user);
                }) //
                .orElseGet(() -> {
                    newUser.setId(id);
                    return repository.save(newUser);
                });
    }

    public void delete(Long id){
        repository.deleteById(id);
    }
}
