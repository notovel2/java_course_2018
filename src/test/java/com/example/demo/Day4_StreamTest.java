package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

import day4.stream_abbreviation;

public class Day4_StreamTest {

	@Test
	public void USA() {
		stream_abbreviation stream = new stream_abbreviation();
		String actual  = stream.process("United States of America");
		assertEquals("USA", actual);
	}
	
	@Test
	public void usa() {
		stream_abbreviation stream = new stream_abbreviation();
		String actual  = stream.process("united states of america");
		assertEquals("USA", actual);
	}
	
	@Test
	public void LASER() {
		stream_abbreviation stream = new stream_abbreviation();
		String actual  = stream.process("Light Amplification by Stimylation of Emitted Radiation");
		assertEquals("LASER", actual);
	}
	
	@Test
	public void JTW() {
		stream_abbreviation stream = new stream_abbreviation();
		String actual  = stream.process("Jordan Of the World");
		assertEquals("JTW", actual);
	}
}
