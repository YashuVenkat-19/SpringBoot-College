package com.example.day2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @Value("${name}")
    private String name;

    @GetMapping("/getName")
    public String getName() {
        return name;
    }
}
