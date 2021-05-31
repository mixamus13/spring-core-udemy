package com.mixamus.springcore.applications;

import com.mixamus.springcore.domain.TrackCoach;
import com.mixamus.springcore.repository.Coach;

public class MyApp {

    public static void main(String[] args) {

        // create the object
        Coach theCoach = new TrackCoach();

        // use the object
        System.out.println(theCoach.getDailyWorkout());
    }

}
