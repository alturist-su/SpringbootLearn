package com.springlearn.myApplication.config;

import com.springlearn.myApplication.coach.Coach;
import com.springlearn.myApplication.coach.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    //the bean id defaults to the method name
    //for custom bean id:
    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
