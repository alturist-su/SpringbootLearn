package com.springlearn.myApplication.coach;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

    @Override
    public String getDailyUpdate() {
        return "Do baseball practice";
    }
}
