package com.joseph.RestAPIs.helloA;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllerA {

    @GetMapping("/helloA")
    public HelloBeanA greet(){
        return new HelloBeanA("Hello Developer Dante");
    }
}
