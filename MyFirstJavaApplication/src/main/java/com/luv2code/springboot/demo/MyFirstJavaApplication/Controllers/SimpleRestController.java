package com.luv2code.springboot.demo.MyFirstJavaApplication.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {
    /*This is a Simple Rest Controller that has 2 mappings*/
    @GetMapping("/")
    public String greet(){
        return "Hey Lets rock It";
    }

// This is for testing spring-boot-dev-tools added in pom.xml
    @GetMapping("/workOut")
    public String workOut(){
        return "you need to exercise";
    }

}
