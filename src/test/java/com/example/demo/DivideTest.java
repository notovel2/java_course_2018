package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class DivideTest {
	@Rule
	public ExpectedException expected = ExpectedException.none();
	
	@Test
	public void shouldThrowException3() {
		Div div = new Div();
		expected.expect(ArithmeticException.class);
		div.process(1, 0);
	}
	
	@Test
	public void shouldThrowDivideByZeroException() {
		Div div = new Div();
		
		try {
			double result = div.process(1,0);			
			fail("Should not be here!!");			
		} catch (ArithmeticException e) {
		}
	}
	
	@Test(expected=ArithmeticException.class)
	public void shoutThrowException2() {
		Div div=new Div();
		div.process(1, 0);
	}

}
