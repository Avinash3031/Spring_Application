package com.luv2code.springdemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	

//public void setFortuneService(FortuneService fortuneService) {
// this.fortuneService = fortuneService;
//}

	@Override
	public String getDailyWorkout() {
		
		return "Practice backhand Volley for 1 hr";
	}
	


	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
