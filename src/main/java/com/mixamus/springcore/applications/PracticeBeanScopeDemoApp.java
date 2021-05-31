package com.mixamus.springcore.applications;

import com.mixamus.springcore.domain.GolfCoach;
import com.mixamus.springcore.domain.MyGolfCoach;
import com.mixamus.springcore.repository.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeBeanScopeDemoApp {

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // retrieve bean from spring container
        GolfCoach golfCoach = context.getBean("golfCoach", GolfCoach.class);

        MyGolfCoach myGolfCoach = context.getBean("myGolfCoach", MyGolfCoach.class);

        Coach alphaCoach = context.getBean("myGolfCoach", Coach.class);

        // check if they are the same


        // print out the results

        System.out.println("\nMemory location for theCoach: " + myGolfCoach);

        System.out.println("\nMemory location for alphaCoach: " + golfCoach + "\n");

        // close the context
        context.close();
    }

}








