package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        //check if they are the same
        boolean result = theCoach==alphaCoach;
        System.out.println("Result = " + result);

        // Compare memory location
        // Same if no set scope in beanScope-applicationContext.xml (Singleton)
        // Different if scope prototype is defined in beanScope-applicationContext.xml (Create new instance)
        System.out.println("theCoach = " + theCoach);
        System.out.println("alphaCoach = " + alphaCoach);

        // close the context
        context.close();
    }
}
