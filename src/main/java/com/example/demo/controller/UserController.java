package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1")
public class UserController {
    @GetMapping("/getUser")
    public String getUser(){
        return "This is my first REST api";
    }

    @PostMapping("/addUser")
    public String addUser(){
        return "This is addUser REST api";
    }
}
