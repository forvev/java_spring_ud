package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myTennisCoach", Coach.class);
		Coach differentCoach = context.getBean("myTennisCoach", Coach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//let's call our new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println("id theCoach: "+theCoach);
		System.out.println("id differentCoach: "+differentCoach);
		
		
		//close the context
		context.close();

	}

}
