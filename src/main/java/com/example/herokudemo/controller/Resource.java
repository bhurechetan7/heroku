package com.example.herokudemo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Resource {

    @GetMapping("/welcome")
      public String msg(){

          return "Hello";
      }
}
