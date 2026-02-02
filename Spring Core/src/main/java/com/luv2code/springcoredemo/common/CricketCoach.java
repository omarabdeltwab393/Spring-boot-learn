package com.luv2code.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Lazy
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    //define our init method
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("In DoMyStartupStuff: " + getClass().getSimpleName());
    }

    //define our destroy method
    @PreDestroy
    public void doMyShutdownStuff() {
        System.out.println("In DoMyShutdownStuff: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes.";
    }
}
