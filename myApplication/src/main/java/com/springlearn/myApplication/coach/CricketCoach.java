package com.springlearn.myApplication.coach;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    public CricketCoach(){
    
        System.out.println("In constructor: "+ getClass().getSimpleName());
    }

    //define init method
    @PostConstruct
    public void doStuff(){
        System.out.println("Do the stuff: "+getClass().getSimpleName());
    }

    //define destroy method
    @PreDestroy
    public void doCleanup(){
        System.out.println("Do the cleanup: "+getClass().getSimpleName());
    }

    //overriden method
    @Override
    public String getDailyUpdate() {
        return "Practice fast bowling";
    }
}
