package com.expertise.microservices.example.controller;

import com.expertise.microservices.example.model.User;
import com.expertise.microservices.example.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/store")
public class UserController {

    @Autowired
    private UserServiceI userServiceI;

    @PostMapping
    public ResponseEntity<User> storeUser(@RequestBody User user) {
        return ResponseEntity.ok(userServiceI.saveUser(user));
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id) {
        return ResponseEntity.ok(userServiceI.getUserByID(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user) {
        return ResponseEntity.ok(userServiceI.updateUser(id, user));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        userServiceI.deleteUser(id);
        return ResponseEntity.ok("Deleted successfully");
    }

}
