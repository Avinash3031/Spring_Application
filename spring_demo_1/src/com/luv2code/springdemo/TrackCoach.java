package com.luv2code.springdemo;

public class TrackCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "run for 30 min";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public void doMyStartUpStuff() {
		System.out.println("Inside init method");
	}

	public void doMyCleanUpStuff() {
		System.out.println("Inside destroy method");
	}
}
