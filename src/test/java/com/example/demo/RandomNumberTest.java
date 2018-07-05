package com.example.demo;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

import day4.Demo;
import day4.MyRandom;

public class RandomNumberTest {

	@Test
	public void random_5() {
		Demo demo = new Demo();
		Random random = new Random();
		assertEquals(5, demo.generateNumber(new Random5()));
	}

}

class Random5 implements MyRandom{


	@Override
	public int nextInt() {
		// TODO Auto-generated method stub
		return 5;
	}
}