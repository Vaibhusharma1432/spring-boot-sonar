package com.springBoot.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public ResponseEntity<String> getStringMethod(){
        System.out.println(System.getenv("SONAR_LOGIN"));
        return new ResponseEntity<>("Welcome to Home", HttpStatus.OK);
    }
}
