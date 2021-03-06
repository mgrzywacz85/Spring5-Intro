package com.marcin.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoClass {

	public static void main(String[] args) {

		// load Spring configuration file

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve the bean from spring container

		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

		// call methods from bean

		System.out.println(theCoach.getDailyWorkout());

		System.out.println(theCoach.getDailyFortune());

		// calling value setter methods

		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());

		// close context
		context.close();

	}

}
