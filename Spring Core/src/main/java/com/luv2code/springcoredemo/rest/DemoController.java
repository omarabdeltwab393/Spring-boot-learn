package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define a private field for the dependency
    private Coach coach;

    private Coach coach2;

//    define a constructor for dependency injection
    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach coach,
                          @Qualifier("cricketCoach" ) Coach coach2) {
        System.out.println("In Constructor: " + getClass().getSimpleName());
        this.coach = coach;
        this.coach2 = coach2;
    }


//    @Autowired
//    public DemoController(Coach coach) {
//        this.coach = coach;
//    }

    //Setter Injection
//    @Autowired
//    public void setCoach(Coach coach) {
//        this.coach = coach;
//    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return this.coach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check(){
        return "Comparing beans: coach == coach2, " + (this.coach == this.coach2);
    }
}
