package com.springlearn.myApplication.coach;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

    public BaseballCoach(){
        System.out.println("In constructor: "+ getClass().getSimpleName());
    }

    //overriden method of Coach
    @Override
    public String getDailyUpdate() {
        return "Do baseball practice";
    }
}
