package com.qa.calculator;

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
		int actualValue = calc.add(2, 2);
		Assert.assertEquals(4, actualValue);
	}

	@Test
	public void Multi() {
		double actualValue = calc.multi(2.0, 2.0);
		Assert.assertEquals("Muliplying not working", 4.0, actualValue, 0.1);
	}

}
