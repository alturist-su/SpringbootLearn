package com.springlearn.myApplication.coach;

import org.springframework.stereotype.Component;

@Component
//new object instance for each injection
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TrackCoach implements Coach{

    //track coach
    public TrackCoach(){
        System.out.println("In constructor: "+ getClass().getSimpleName());
    }
    
    @Override
    public String getDailyUpdate() {
        return "Practice Tracking daily";
    }
}
