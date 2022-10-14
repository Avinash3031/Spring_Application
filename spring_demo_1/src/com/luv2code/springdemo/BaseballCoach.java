package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	//define a private field for the dependency
	FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "spend 30 ins in the batting field";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
}
