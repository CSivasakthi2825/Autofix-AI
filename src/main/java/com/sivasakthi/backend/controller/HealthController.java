package com.sivasakthi.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/api/health")
    public String health() {
        return "AutoFix AI Backend is Running!";
    }

    @GetMapping("/api/name")
    public String name() {
        return "My name is Sivasakthi";
    }
}