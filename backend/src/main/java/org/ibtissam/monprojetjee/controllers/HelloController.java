package org.ibtissam.monprojetjee.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:5174") // Autorise Vite
public class HelloController {

    @GetMapping("/api/hello")
    public String sayHello() {
        return "Bonjour depuis Spring Boot!";
    }
}
