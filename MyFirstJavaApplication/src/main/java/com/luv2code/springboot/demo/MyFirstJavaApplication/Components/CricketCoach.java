package com.luv2code.springboot.demo.MyFirstJavaApplication.Components;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach  implements  Coach{


    @Override
    public String getMessage() {
        return "Need to Practice Bowling Fast everyday";
    }
}
