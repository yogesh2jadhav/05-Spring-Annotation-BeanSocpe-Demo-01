package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringAnnotationBeanScopeDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext CPXApplicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Coach myCoach = CPXApplicationContext.getBean("kabbdhiCoach", Coach.class);
		
		System.out.println(myCoach.getDailyWorkout());

	}

}
