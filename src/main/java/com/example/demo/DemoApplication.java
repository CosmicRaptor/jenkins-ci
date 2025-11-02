package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        // This is your non-Hello-World program
        return "My CI/CD Pipeline Project is Running!";
    }

    @GetMapping("/status")
    public java.util.Map<String, Object> getStatus() {
        // A slightly more complex program
        java.util.Map<String, Object> status = new java.util.HashMap<>();
        status.put("status", "OK");
        status.put("timestamp", java.time.Instant.now().toString());
        return status;
    }
}