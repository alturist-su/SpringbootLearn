package com.springlearn.myApplication.coach;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("In constructor: "+ getClass().getSimpleName());
    }
    
    @Override
    public String getDailyUpdate() {
        return "Practice fast bowling";
    }
}
