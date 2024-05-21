package com.springlearn.myApplication.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResController {

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
