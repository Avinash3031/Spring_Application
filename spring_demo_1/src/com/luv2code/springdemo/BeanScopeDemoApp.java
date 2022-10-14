package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope_applicationContext.xml");
		Coach theCoach = context.getBean("myCoach",TrackCoach.class);
		Coach alphaCoach = context.getBean("myCoach",TrackCoach.class);
		
		boolean result = (theCoach==alphaCoach);
		
		System.out.println(result);
		System.out.println("memory address of theCoach"+theCoach);
		System.out.println("memory address of theCoach"+alphaCoach);
		

	}

}
