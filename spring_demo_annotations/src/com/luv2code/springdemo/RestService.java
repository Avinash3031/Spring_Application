package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RestService implements FortuneService {

	@Override
	public String getFortune() {
		return "Take some rest for this day";
	}

}
