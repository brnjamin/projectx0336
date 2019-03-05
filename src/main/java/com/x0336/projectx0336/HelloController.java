package com.x0336.projectx0336;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

@RestController
public class HelloController {
    private final static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd HH:mm:ss.SSSSSS Z");
    @RequestMapping("/")
    public String index() {
        ZonedDateTime now = ZonedDateTime.now();
        String str = "<html>";
        str = str + "  Hello! Greetings from Belgium... (at " + now.format(formatter) + ")";
        str = str + "  <br/>";
        str = str + "  Default timezone: " + TimeZone.getDefault();
        str = str + "  <br/>";
        str = str + "</html>";
        return str;
    }
}