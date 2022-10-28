package com.pizzu.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	// add an init method
	
	public void doMyStuff() {
		System.out.println("I'm MORBING!");
	}
	// add a destroy method

	public void endedMyStuff() {
		System.out.println("It's Morbing time!");
	}
}










