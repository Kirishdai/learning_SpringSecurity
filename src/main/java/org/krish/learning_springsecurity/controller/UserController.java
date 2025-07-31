package org.krish.learning_springsecurity.controller;

import org.krish.learning_springsecurity.model.Users;
import org.krish.learning_springsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public Users registerUser(@RequestBody Users user) {

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userService.registerUser(user);
     }
}
