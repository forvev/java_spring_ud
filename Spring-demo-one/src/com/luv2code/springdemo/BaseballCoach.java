package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortunceService) {
		fortuneService = theFortunceService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 mintues on batting practice";
	}

	@Override
	public String getDailyFortune() {
		
		//use my fortuneService to get a fortune
		return null;
	}
}
