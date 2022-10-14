package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifeCycle_applicationContext.xml");
		Coach theCoach = context.getBean("myCoach",TrackCoach.class);
		context.close();

	}

}
