package com.springlearn.myApplication.coach;

import org.springframework.stereotype.Component;

@Component
@Lazy
public class TennisCoach implements Coach{

    public TennisCoach(){
        System.out.println("In constructor: "+ getClass().getSimpleName());
    }
    
    @Override
    public String getDailyUpdate() {
        return "Practice Tennis daily";
    }
}
