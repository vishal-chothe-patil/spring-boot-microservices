package com.expertise.microservices.example.service.impl;

import com.expertise.microservices.example.repository.UserRepository;
import com.expertise.microservices.example.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserServiceI {

    @Autowired
    private UserRepository userRepository;

}
