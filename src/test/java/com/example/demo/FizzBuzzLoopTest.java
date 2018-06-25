package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzLoopTest {

	@Test
	public void say_1_when_input_1() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		String actualResult = fizzBuzz.sayLoop(1);
		assertEquals("1", actualResult);
	}

	@Test
	public void say_2_when_input_2() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		String actualResult = fizzBuzz.sayLoop(2);
		assertEquals("2", actualResult);
	}

	@Test
	public void say_Fizz_when_input_3() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		String actualResult = fizzBuzz.sayLoop(3);
		assertEquals("Fizz", actualResult);
	}

	@Test
	public void say_4_when_input_4() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		String actualResult = fizzBuzz.sayLoop(4);
		assertEquals("4", actualResult);
	}

	@Test
	public void say_Buzz_when_input_5() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		String actualResult = fizzBuzz.sayLoop(5);
		assertEquals("Buzz", actualResult);
	}

	@Test
	public void say_Fizz_when_input_6() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		String actualResult = fizzBuzz.sayLoop(6);
		assertEquals("Fizz", actualResult);
	}

	@Test
	public void say_7_when_input_7() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		String actualResult = fizzBuzz.sayLoop(7);
		assertEquals("7", actualResult);
	}

	@Test
	public void say_8_when_input_8() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		String actualResult = fizzBuzz.sayLoop(8);
		assertEquals("8", actualResult);
	}

	@Test
	public void say_Fizz_when_input_9() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		String actualResult = fizzBuzz.sayLoop(9);
		assertEquals("Fizz", actualResult);
	}

	@Test
	public void say_Buzz_when_input_10() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		String actualResult = fizzBuzz.sayLoop(10);
		assertEquals("Buzz", actualResult);
	}

	@Test
	public void say_FizzBuzz_when_input_15() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		String actualResult = fizzBuzz.sayLoop(15);
		assertEquals("FizzBuzz", actualResult);
	}

}
