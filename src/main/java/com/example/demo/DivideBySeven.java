package com.example.demo;

public class DivideBySeven implements DivideElement{
	int divideNumber = 7;
	String returnValue = "KBTG";
	@Override
	public String say(int input) {
		return (input % divideNumber == 0)? returnValue:"";
	}


}
