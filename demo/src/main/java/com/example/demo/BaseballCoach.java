package com.example.demo;

public class BaseballCoach implements Coach{

    // define a private field for the dependency
    private FortuneService fortuneService;

    // define a constructor for dependency injection
    public BaseballCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Baseball workout";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
