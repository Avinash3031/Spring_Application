package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	SwimCoach (FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}
	@Value("${TeamEmail}")
	private String email;
	
	@Value("${TeamName}")
	private String name;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Swim for 30 min with 2 breaks as a warm up";
	}

	@Override
	public String getDailyFortune() {
	
		return fortuneService.getFortune(); 
	}

}
