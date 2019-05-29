package com.qa.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	Calculator calc;

	@Before
	public void setup() {
		calc = new Calculator();
	}

	@Test
	public void test() {
		double actualValue = calc.add(0.1, 0.1, 0.1);
		Assert.assertEquals(0.3, actualValue, 0.1);
	}

	@Test
	public void subbing() {
		double actualValue = calc.sub(4, 2);
		assertEquals("Didn't subtract correctly", 2.0, actualValue, 0.1);
	}

}
