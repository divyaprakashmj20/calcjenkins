package com.nissan.jenk.calculator;

import static org.junit.Assert.*;

import org.junit.Test;



public class TestCalc {

	@Test
	public void testadd() {
		calculator c= new calculator();
		
		assertEquals(10,c.add(5,5));
	}
	
	@Test
	public void testsub() {
		calculator c= new calculator();
		
		assertEquals(0,c.sub(5,5));
	}

}
