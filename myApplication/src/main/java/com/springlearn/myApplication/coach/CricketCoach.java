package com.springlearn.myApplication.coach;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyUpdate() {
        return "Practice fast bowling";
    }
}
