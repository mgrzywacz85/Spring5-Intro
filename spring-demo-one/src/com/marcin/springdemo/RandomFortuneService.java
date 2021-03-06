package com.marcin.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	private FortuneService happyFortune;
	private FortuneService alrightFortune;
	private FortuneService notBadFortune;


	public void setHappyFortune(FortuneService happyFortune) {
		this.happyFortune = happyFortune;
	}


	public void setAlrightFortune(FortuneService alrightFortune) {
		this.alrightFortune = alrightFortune;
	}


	public void setNotBadFortune(FortuneService notBadFortune) {
		this.notBadFortune = notBadFortune;
	}
	
	

	@Override
	public String getFortune() {
		
		FortuneService[] fortunes = new FortuneService[] {happyFortune, alrightFortune, notBadFortune};
		
		Random rand = new Random();
		
		int randomFortune = rand.nextInt(fortunes.length);
		
		return fortunes[randomFortune].getFortune();
	}

}
