package com.airways.localAirline;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CarTest {
	
	@BeforeClass
	public static void beforeClassMethod() {
		System.out.println("Before class");
	}
	@AfterClass
	public static void afterClassMethod() {
		System.out.println("After class");
	}
	@After
	public void afterMethod() {
		System.out.println("After method");
	}
	@Before
	public void beforeMethod() {
		System.out.println("before method");
	}
	@Test
	public void testToPrintLength() {
		Car c = new Car();
		int output = c.printName("tata");
		assertEquals(4, output);
		System.out.println("method 1 is called");
	}
	@Test
	public void testm2() {
		System.out.println("method 2 is called");
	}

}
