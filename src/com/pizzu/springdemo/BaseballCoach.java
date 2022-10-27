package com.pizzu.springdemo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	 
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}








