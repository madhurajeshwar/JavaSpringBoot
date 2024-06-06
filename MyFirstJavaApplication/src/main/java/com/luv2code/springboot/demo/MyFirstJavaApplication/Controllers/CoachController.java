package com.luv2code.springboot.demo.MyFirstJavaApplication.Controllers;

import com.luv2code.springboot.demo.MyFirstJavaApplication.Components.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachController {
    private Coach myCoach;

    @Autowired
    public  CoachController(Coach myCoach){
        this.myCoach =myCoach;
    }
    @GetMapping("/dailyWorkout")
    public String dailyWorkOut(){
            return myCoach.getMessage();
    }
}
