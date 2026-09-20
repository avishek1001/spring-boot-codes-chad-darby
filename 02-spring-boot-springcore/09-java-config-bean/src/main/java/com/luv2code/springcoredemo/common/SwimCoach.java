package com.luv2code.springcoredemo.common;

import org.springframework.beans.factory.annotation.Qualifier;

public class SwimCoach implements Coach{

    private Coach myCoach;

    public SwimCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());


    }
    @Override
    public String getDailyWorkout() {
        return "Swim 1000 metres for warm-up.";
    }
}
