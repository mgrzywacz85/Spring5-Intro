package com.marcin.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
//	//dependency injection directly on the field using @Autowired below - via Java Reflection
//	
//	//@Qualifier defines which implementation of the interface to inject
//	
//	@Autowired
//	@Qualifier("averageFortuneService")
	private FortuneService fortuneService;
//	
//	//dependency injection via any method below as long as @Autowired tag is used
	
//	@Autowired
//	public void randomMethodName(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
		
	//dependency injection via constructor below

	@Autowired
	public TennisCoach(@Qualifier("averageFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice tennis for 30 mins";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
