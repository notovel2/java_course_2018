package com.example.demo;

public class DivideByFive implements DivideElement {
	int divideNumber = 5;
	String returnValue = "Buzz";
	@Override
	public String say(int input) {
		return (input % divideNumber == 0)? returnValue:"";
	}
}
