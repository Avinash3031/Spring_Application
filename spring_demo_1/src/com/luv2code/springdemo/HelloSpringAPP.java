package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringAPP {

	public static void main(String[] args) {
	//load the configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
	// retrieve the bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
	//call the methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
	//close the context
		context.close();

	}

}
