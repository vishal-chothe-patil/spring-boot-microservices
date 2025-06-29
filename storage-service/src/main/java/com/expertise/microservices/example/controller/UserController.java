package com.expertise.microservices.example.controller;

import com.expertise.microservices.example.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserServiceI userServiceI;

}
