package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	//create an array of strings
	private String[] Msgs = {
			"Hard roads make the best drivers",
			"Worth is not given , it must be made",
			"You are responsible for everything you are and evrything you are not",
			"Dont cry because its over, smile because it happened"
	};
	
	private Random random = new Random();

	@Override
	public String getFortune() {	
		int index = random.nextInt(Msgs.length);
		return Msgs[index];
	}

}
