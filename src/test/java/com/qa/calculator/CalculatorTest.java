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
	public void adding() {
		
		double actualValue = calc.add(0.1, 0.1);
		Assert.assertEquals(0.2, actualValue, 0.1);
	}

		
	   
	   
	   
	   
	   
	   
	   
   }
   

