package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class KabbdhiCoach implements Coach {

	@Value("${demo.email}")
	public String email;
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Do 10 push up evey morning. Email="+email;
	}

}
