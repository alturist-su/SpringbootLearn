package com.springlearn.myApplication.coach;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{

    public TrackCoach(){
        System.out.println("In constructor: "+ getClass().getSimpleName());
    }
    
    @Override
    public String getDailyUpdate() {
        return "Practice Tracking daily";
    }
}
