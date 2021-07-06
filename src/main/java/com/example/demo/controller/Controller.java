package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class Controller {
    @GetMapping("/api/v1/")
    public ResponseEntity apiv1() {
        HashMap<String, String> hsMsg = new HashMap<>();
        hsMsg.put("msg_key", "Welcome to API v1");
        hsMsg.put("msg_content", "If you see this, then your deployment is successful");

        return ResponseEntity.ok(hsMsg);
    }
}
