package com.joseph.RestAPIs.greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greet")
    public String Greet(){
        return "Good Evening Developer Joseph";
    }
}


