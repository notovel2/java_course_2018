package com.example.demo;

public class DivideByThree implements DivideElement{
	int divideNumber = 3;
	String returnValue = "Fizz";
	@Override
	public String say(int input) {
		return (input % divideNumber == 0)? returnValue:"";
	}
	
}
