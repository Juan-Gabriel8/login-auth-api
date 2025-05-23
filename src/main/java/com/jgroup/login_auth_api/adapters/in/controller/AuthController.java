package com.jgroup.login_auth_api.adapters.in.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("/index")
    public String home() {
        return "index";
    }
}
