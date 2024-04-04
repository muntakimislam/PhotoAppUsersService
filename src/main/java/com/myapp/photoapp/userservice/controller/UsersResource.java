package com.myapp.photoapp.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UsersResource {
    @GetMapping("/status")
    public String status() {
        return "Ok";
    }
}
