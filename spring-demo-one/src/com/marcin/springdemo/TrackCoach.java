package com.marcin.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {

	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}	
	
	@Override
	public String getDailyWorkout() {
		return "Run 5k";
	}

	@Override
	public String getDailyFortune() {
		//use the fortuneService to get fortune
		
		return fortuneService.getFortune();
	}
	
	//add an init method
	
	public void initMethodMarcin() {
		System.out.println("TrackCoach: inside init initMethodMarcin");
	}
	
	//add destroy method
	
	
	public void destroyMethodMarcin() {
		System.out.println("TrackCoach: inside init destroyMethodMarcin");
	}
	
}
