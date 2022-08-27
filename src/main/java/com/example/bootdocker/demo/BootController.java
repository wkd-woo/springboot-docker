package com.example.bootdocker.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/source/{name}")
    public ResponseEntity<String> test(@PathVariable String name) {
        return ResponseEntity.ok("Hi " + name + ", how you doin?");
    }
}
