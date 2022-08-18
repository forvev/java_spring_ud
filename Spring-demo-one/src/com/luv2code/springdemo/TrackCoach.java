package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	
	public TrackCoach() {
		
	}
	
	//define a constructor for dependency injection
	public TrackCoach(FortuneService theFortunceService) {
			fortuneService = theFortunceService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: "+ fortuneService.getFortune();
	}

}
