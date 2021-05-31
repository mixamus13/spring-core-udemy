package com.mixamus.springcore.domain;

import com.mixamus.springcore.repository.Coach;
import com.mixamus.springcore.service.FortuneService;

public class GolfCoach implements Coach {

    private final FortuneService fortuneService;

    public GolfCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your putting skills for 2 hours today";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
