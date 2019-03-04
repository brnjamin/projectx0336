package com.x0336.projectx0336;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class HelloController {
    private final static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd HH:mm:ss.SSSSSS Z");
    @RequestMapping("/")
    public String index() {
        String now = ZonedDateTime.now().format(formatter);
        return "Hello! Greetings from Belgium... (at " + now + ")";
    }
}