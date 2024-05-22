package com.luv2code.springboot.demo.MyFirstJavaApplication.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {
    @GetMapping("/")
    /**/
    public String greet(){
        return "Hey Lets rock It";
    }
}
