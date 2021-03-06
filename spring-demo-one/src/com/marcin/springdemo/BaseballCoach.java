package com.marcin.springdemo;

public class BaseballCoach implements Coach {
	
	//define private field for dependency
	
	private FortuneService fortuneService;
	
	
	//define constructor for dependency injection
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Batting practice for 30 minutes";
	}

	@Override
	public String getDailyFortune() {
		//use the fortuneService to get fortune
		
		return fortuneService.getFortune();
	}

}
