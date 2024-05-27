package com.springlearn.myApplication.coach;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Override
    public String getDailyUpdate() {
        return "Practice Tennis daily";
    }
}
