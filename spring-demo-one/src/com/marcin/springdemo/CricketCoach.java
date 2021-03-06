package com.marcin.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;

	// create no-argument constructor

	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}

	// create setter for Spring to use

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside the setter method - email address value");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside the setter method - team address value");
		this.team = team;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside the setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Practice some cricket stuff for 15 mins";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
