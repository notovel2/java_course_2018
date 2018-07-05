package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FizzBuzz {
	private List<DivideElement> divideElements;

	private boolean haveSameClass(DivideElement element) {
		for (DivideElement divideElement : divideElements) {
			if(divideElement.getClass().equals(element.getClass())) {
				return true;
			}
		}
		return false;
	}
	
	public void setDivideElement(DivideElement element) {
		if(!haveSameClass(element)) {
			divideElements.add(element);
		}
	}

	public FizzBuzz() {
		divideElements = new ArrayList<>();
	}

	public String say(int input) {
		String result;
		result = divideElements.parallelStream()
				.map(c -> c.say(input))
				.collect(Collectors.joining());
		return (result.isEmpty()) ? String.valueOf(input) : result;
	}
	// public String say(int input) {
	// String output = "";
	// if (input % 3 != 0 && input % 5 != 0) {
	// output += input;
	// }
	// else {
	// if (divideBy3(input)) {
	// output += "Fizz";
	// }
	// if (input % 5 == 0) {
	// output += "Buzz";
	// }
	// }
	//
	// return output;
	// }

	public String sayLoop(int input) {
		String inputStr = String.valueOf(input);
		String output = "";
		String[] Fizz = { "", "", "Fizz" };
		String[] Buzz = { "", "", "", "", "Buzz" };
		int input_Fizz = 1, i_Fizz = 0;
		int input_Buzz = 1, i_Buzz = 0;
		while (input_Fizz <= input) {
			for (int i = 0; i < 3 && input_Fizz <= input; i++, input_Fizz++) {
				i_Fizz = i;
			}
		}

		while (input_Buzz <= input) {
			for (int i = 0; i < 5 && input_Buzz <= input; i++, input_Buzz++) {
				i_Buzz = i;
			}
		}
		output += Fizz[i_Fizz] + Buzz[i_Buzz];
		return (output.equals("")) ? inputStr : output;
	}

	private boolean divideBy3(int input) {
		return input % 3 == 0;
	}
}
