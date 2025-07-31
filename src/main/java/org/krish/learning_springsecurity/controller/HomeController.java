package org.krish.learning_springsecurity.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("")
    public String home(HttpServletRequest request) {
        return "Hello World" + request.getSession().getId();
    }
}
