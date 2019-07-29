package com.springdemo;

class SomeCoach implements Coach {

	private FortuneService fortuneService;
	
	public SomeCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Do some swimming";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
