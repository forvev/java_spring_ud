package com.luv2code.springdemo;

public class TennisCoach implements Coach {

	private FortuneService theFortuneService;
	
	public TennisCoach(FortuneService fs) {
		theFortuneService = fs;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Let's play a tennis!";
	}

	@Override
	public String getDailyFortune() {
		return theFortuneService.getFortune();
	}
	
	public void setupsth() {
		System.out.println("do I create sth?");
	}
	
	public void removesth() {
		System.out.println("I'm removing probably");
		
	}

}
