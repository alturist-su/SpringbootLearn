package com.springlearn.myApplication;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyUpdate() {
        return "Practice fast bowling";
    }
}
