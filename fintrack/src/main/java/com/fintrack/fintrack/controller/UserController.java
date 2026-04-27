package com.fintrack.fintrack.controller;

import com.fintrack.fintrack.model.User;
import  com.fintrack.fintrack.service.UserService;
import org.springframework.stereotype.Controller;

@Controller

public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }
    public User salvar(User user){
        return userService.salvar(user);
    }
}
