package com.example.pgr301recap07;

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class demoController {
    
    @GetMapping("/")
    fun helloPage() : String {
        return "Hello Spring boot";
    }
}