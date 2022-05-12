package com.example.user.h2.controller;

import com.example.user.h2.entity.User;
import com.example.user.h2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpHeaders;
import java.util.List;


@Api(tags = "Authentication")
@RestController
public class UserController {

    private final AuthenticationManager authenticationManager;
    private final JwtTokenUtil jwtTokenUtil;
    private final User user;

    private UserService userService;

    @Autowired
    public UserController(AuthenticationManager authenticationManager, JwtTokenUtil jwtTokenUtil, User user, UserService userService) {
        super();
        this.authenticationManager = authenticationManager;
        this.jwtTokenUtil = jwtTokenUtil;
        this.user = user;
    }

    @PostMapping("login")
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
    }


    @GetMapping("/users")
    List<User> getAllUser() {
        return userService.getAll();
    }

    @GetMapping("/username")
    public String currentUserName(User user) {
        return user.getName();
    }

    @GetMapping("/login")
    public String userLogin() {
        return "redirect:/login";
    }


    @PostMapping("/users/user")
    public ResponseEntity<User> saveUser(@RequestBody User newUser) {
        return new ResponseEntity<User>(userService.saveUser(newUser), HttpStatus.CREATED);
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Long id) {
        return new ResponseEntity<User>(userService.getUserById(id), HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<User> updateEmployee(@PathVariable("id") long id
                                               ,@RequestBody User user){
        return new ResponseEntity<User>(userService.updateUser(user, id), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") long id) {
        userService.deleteUser(id);
        return new ResponseEntity<>("User deleted successfully", HttpStatus.OK);
    }

}

