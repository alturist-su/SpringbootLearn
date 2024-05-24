package com.springlearn.myApplication.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResController {

    //inject properties for coach.name and team.name
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    //Expose endpoint for team info
    @GetMapping("/teamInfo")
    public String teamInfo(){
        return "Coach: "+ coachName + "Team Info: "+teamName;
    }
    

    @GetMapping("/get")
    public String getName(){
        return "Sushmita Singh";
    }

    @GetMapping("/city")
    public String getCity(){
        return "GKP";
    }

    @GetMapping("/state")
    public String getState(){
        return "UP";
    }

}
