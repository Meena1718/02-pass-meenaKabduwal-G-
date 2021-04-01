package com.assignment.calculator.examination_calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {
	BasicCalculator basicCal = new BasicCalculator();
	AdvancedCalculator advanceCalc = new AdvancedCalculator();

	@Test
	public void testBasicCalculator() {
		assertEquals(basicCal.addition(3.0, 4.0), 7.0,0.0);
		assertEquals(basicCal.subtraction(5.0,-9.0),14.0,0.0);
		assertEquals(basicCal.multiplication(3.0,-4.0),-12.0,0.0);
		assertEquals(basicCal.division(8.0, 4.0), 2.0,0.0);
	}
	@Test
	public void testAdvancedCalculator() {
		assertEquals(advanceCalc.square(3.0),9.0,0.0);
		assertEquals(advanceCalc.squareRoot(9.0),3.0,0.0);
		assertEquals(advanceCalc.absoluteValue(-3.0),3.0,0.0);
		assertEquals(advanceCalc.raisedToThePowerOf(2.0, 3.0),8.0,0.0);
		assertEquals(advanceCalc.modulus(9.0,3.0),0.0,0.0);
		
}
}