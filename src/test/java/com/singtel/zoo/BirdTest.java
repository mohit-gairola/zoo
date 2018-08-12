package com.singtel.zoo;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BirdTest {
	Bird bird;
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;

	@Before
	public void setUpStreams() {		
		System.setOut(new PrintStream(outContent));
	}

	@After
	public void restoreStreams() {
		System.setOut(originalOut);
	}

	@Test
	public void testDuckSing() {
		bird = new Duck();
		bird.sing();
		Assert.assertEquals("Quack, quack", outContent.toString().trim());
	}
	
	@Test
	public void testChickenSing() {
		bird = new Chicken();
		bird.sing();
		Assert.assertEquals("Cluck, cluck", outContent.toString().trim());
	}
}
