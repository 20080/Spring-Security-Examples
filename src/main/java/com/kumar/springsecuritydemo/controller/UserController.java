package com.kumar.springsecuritydemo.controller;

import com.kumar.springsecuritydemo.model.Users;
import com.kumar.springsecuritydemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/register")
    public Users registerUser(@RequestBody Users user){
        return userService.register(user);
    }

    @PostMapping(value = "/login")
    public String login(@RequestBody Users user){

        return userService.verify(user);
    }

}
