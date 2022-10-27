package com.pizzu.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String email;
	
	private String nameTeam;
	
	public CricketCoach() {
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practise fast bowling for 15 minutes";
	}
	
	public String getEmail() {
		return email;
	}

	public String getNameTeam() {
		return nameTeam;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setNameTeam(String nameTeam) {
		this.nameTeam = nameTeam;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return this.getNameTeam() + " " + this.getEmail() + " " + fortuneService.getFortune() ;
	}

}
