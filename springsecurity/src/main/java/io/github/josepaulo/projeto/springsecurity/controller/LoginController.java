package io.github.josepaulo.projeto.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @GetMapping("/login")
    public String loginEndpoint() {
        return "Login!";
    }
}
