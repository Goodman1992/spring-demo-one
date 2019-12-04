package com.springdemo;

public class TrackCoach implements Coach {

	// private field for dependency
	private FortuneService fortuneService;
	
	//constructor for dependency injection
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: "+fortuneService.getFortune();
	}

	// add an init method
	public void doMyStartupStaff() {
		System.out.println("TrackCoach: inside method doMyStartupStaff");
	}
	
	// add an destory method
	public void doMyCleanupStaff() {
		System.out.println("TrackCoach: inside method doMyCleanupStaff");
	}
}
