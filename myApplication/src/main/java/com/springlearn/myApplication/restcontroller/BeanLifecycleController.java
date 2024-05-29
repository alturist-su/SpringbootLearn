package com.springlearn.myApplication.restcontroller;

import com.springlearn.myApplication.coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BeanLifecycleController {

    private Coach coach;

    //define a constructor for dependency injection
    @Autowired
    public BeanLifecycleController( @Qualifier("cricketCoach") Coach theCoach){
        System.out.println("In constructor: "+ getClass().getSimpleName());
        coach = theCoach;
    }
}
