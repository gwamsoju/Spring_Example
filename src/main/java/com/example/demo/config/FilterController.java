package com.example.demo.config;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilterController {

    @GetMapping("/")
    public String Test(){
        System.out.println("Test ~");
        return "Test Complete ! ";
    }
}
