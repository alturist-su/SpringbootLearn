package com.springlearn.myApplication.coach;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    //tennis Coach 
    public TennisCoach(){
        System.out.println("In constructor: "+ getClass().getSimpleName());
    }
    
    @Override
    public String getDailyUpdate() {
        return "Practice Tennis daily";
    }
}
