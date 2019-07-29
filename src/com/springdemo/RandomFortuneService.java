package com.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	private String[] messageArray=new String[] {
		"Today is a good day!",
		"Not today!",
		"Hmmmmm...."
	};
	@Override
	public String getFortune() {
		int random=new Random().nextInt(3);
		return messageArray[random];
	}

}
