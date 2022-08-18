package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private String data[]= { "This is my string" };
	private Random myRandom = new Random();
	
	
	@Override
	public String getFortune() {
		String temp;
		int index = myRandom.nextInt(data.length);
		
		temp = data[index];
		
		return temp;
	}//dokoncz xml and main
	
	
}
