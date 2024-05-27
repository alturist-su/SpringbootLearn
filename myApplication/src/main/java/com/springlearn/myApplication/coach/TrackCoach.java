package com.springlearn.myApplication.coach;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
    @Override
    public String getDailyUpdate() {
        return "Practice Tracking daily";
    }
}
