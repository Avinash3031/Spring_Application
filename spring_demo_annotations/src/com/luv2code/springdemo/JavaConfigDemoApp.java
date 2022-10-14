package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		//load the spring Configuration file
		AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//retrieve the bean from container
		TennisCoach theCoach = context.getBean("tennisCoach",TennisCoach.class);
		
		
		//Call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
		

	}

}
