package com.mixamus.springcore.domain;

import com.mixamus.springcore.repository.Coach;
import com.mixamus.springcore.service.FortuneService;
import org.springframework.beans.factory.DisposableBean;

public class TrackCoach implements Coach, DisposableBean {

    private FortuneService fortuneService;

    public TrackCoach() { }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It: " + fortuneService.getFortune();
    }

    // add an init method
    public void doMyStartupStuff() {
        System.out.println("TrackCoach: inside method doMyStartupStuff");
    }

    // add a destroy method
    public void doMyCleanupStuffYoYo() {
        System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo destroy from prototype");
    }
}










