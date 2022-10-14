package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		//load the spring Configuration file
		AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//retrieve the bean from container
		SwimCoach theCoach = context.getBean("swimCoach",SwimCoach.class);
		
		
		//Call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getName());
		
		//close the context
		context.close();
		

	}

}
