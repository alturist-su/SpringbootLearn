package com.springlearn.myApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachController {

    //define a private field for the dependency
    private Coach coach;

    //define a constructor for dependency injection
    @Autowired
    public CoachController(Coach theCoach){
        coach = theCoach;
    }

    @GetMapping("/getDailyUpdate")
    public String getDailyWorkout(){
        return coach.getDailyUpdate();
    }
}