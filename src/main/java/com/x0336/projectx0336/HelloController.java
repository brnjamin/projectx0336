package com.x0336.projectx0336;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "Hello! Greetings from Belgium (at " + LocalDateTime.now() + ")...";
    }
}