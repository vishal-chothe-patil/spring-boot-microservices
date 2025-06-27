package com.expertise.microservices.example.service.impl;

import com.expertise.microservices.example.model.UserRequest;
import com.expertise.microservices.example.service.ValidationServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ValidationServiceImpl implements ValidationServiceI {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${storage.service.url}")
    private String storageBaseUrl;

    @Override
    public ResponseEntity<String> forwardPost(UserRequest request) {
        return restTemplate.postForEntity(storageBaseUrl, request, String.class);
    }

    @Override
    public ResponseEntity<String> forwardPut(Long id, UserRequest request) {
        String url = storageBaseUrl + "/" + id;
        restTemplate.put(url, request);
        return ResponseEntity.ok("User updated successfully");
    }

    @Override
    public ResponseEntity<String> forwardDelete(Long id) {
        String url = storageBaseUrl + "/" + id;
        restTemplate.delete(url);
        return ResponseEntity.ok("User deleted successfully");
    }

    @Override
    public ResponseEntity<String> forwardGet(Long id) {
        String url = storageBaseUrl + "/" + id;
        return restTemplate.getForEntity(url, String.class);
    }
}