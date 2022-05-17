package com.example.user.h2.controller;

import com.example.user.h2.entity.User;
import com.example.user.h2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpHeaders;
import java.util.List;


@RestController
@RequestMapping("/")
public class UserController {

    //private final AuthenticationManager authenticationManager;
    //private final JwtTokenUtil jwtTokenUtil;
    private final UserService userService;

    @Autowired
    public UserController( UserService userService) {
        super();
        this.userService = userService;
    }

    @GetMapping("/login")
    public String login() {
        return "/h2-console";
    }

    @GetMapping("/")
    public String index() {
        return "greeting from spring boot";
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAll();
    }


    /*@PostMapping("login")
    public ResponseEntity<User> login(@RequestBody @Valid AuthRequest request) {
        try {
            Authentication authenticate = authenticationManager
                    .authenticate(
                            new UsernamePasswordAuthenticationToken(
                                    request.getUsername(), request.getPassword()
                            )
                    );
            User user = (User) authenticate.getPrincipal();

            return ResponseEntity.ok()
                    .header(
                            HttpHeaders.AUTHORIZATION,
                            jwtTokenUtil.generateAccessToken(user)
                    )
                    .body(userViewMapper.toUserView(user));

        } catch (BadCredentialsException ex) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }*/




    @PostMapping("/users/user")
    public void saveUser(@RequestBody User newUser) {
        userService.saveUser(newUser);
    }

}

