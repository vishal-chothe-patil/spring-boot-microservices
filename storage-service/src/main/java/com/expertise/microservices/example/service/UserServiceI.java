package com.expertise.microservices.example.service;

import com.expertise.microservices.example.model.User;

public interface UserServiceI {

    User saveUser(User user);

    User getUserByID(Long id);

    User updateUser(Long id, User user);

    void deleteUser(Long id);

}
