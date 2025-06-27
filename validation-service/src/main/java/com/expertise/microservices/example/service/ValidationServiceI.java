package com.expertise.microservices.example.service;

import com.expertise.microservices.example.model.UserRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;

public interface ValidationServiceI {

    ResponseEntity<String> forwardPost(@Valid UserRequest request);

    ResponseEntity<String> forwardPut(Long id, @Valid UserRequest request);

    ResponseEntity<String> forwardDelete(Long id);

    ResponseEntity<String> forwardGet(Long id);
}