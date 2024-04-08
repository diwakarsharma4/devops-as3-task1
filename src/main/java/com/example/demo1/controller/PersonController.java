package com.example.demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/persons")
    public String getAllPersons() {
        return "All persons details";
    }

    @GetMapping("/persons/{id}")
    public String getPersonById() {
        return "Person details by ID";
    }

}
