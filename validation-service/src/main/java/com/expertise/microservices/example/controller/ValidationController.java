package com.expertise.microservices.example.controller;

import com.expertise.microservices.example.model.UserRequest;
import com.expertise.microservices.example.service.ValidationServiceI;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/validate")
public class ValidationController {

    @Autowired
    private ValidationServiceI validationServiceI;

    @PostMapping
    public ResponseEntity<String> validateAndSave(@Valid @RequestBody UserRequest request) {
        return validationServiceI.forwardPost(request);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> validateAndUpdate(@PathVariable Long id, @Valid @RequestBody UserRequest request) {
        return validationServiceI.forwardPut(id, request);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> validateAndDelete(@PathVariable Long id) {
        return validationServiceI.forwardDelete(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getUser(@PathVariable Long id) {
        return validationServiceI.forwardGet(id);
    }
}
