package com.dlv.beans.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.dlv.beans.Calculator;
import com.dlv.beans.PalindromeCheck;

public class CalculatorTest {
	
	public static Calculator calc=null;
	
	@BeforeClass
	public static void init() {
		calc= new Calculator();
	}
	
	@AfterClass
	public static void destroy() {
		calc=null;
	}
	
	@Test
	public void testAdd() {
		//Calculator calc=new Calculator();  //in every method creating obj is not recommended 
		Integer actualResult = calc.add(10, 20);
		Integer expectedResult = 30;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testMultiply() {
		//Calculator calc=new Calculator();
		Integer actualResult = calc.multiply(5,3);
		Integer expectedResult = 15;
		
		assertEquals(expectedResult, actualResult);
	}
	
	
	@ParameterizedTest
	@ValueSource(strings= {"malayalam","racecar","madam","liril","raghu"})
	public void testIsPalindrome(String str) {
		
		PalindromeCheck pc=new PalindromeCheck();
		
		boolean actual = pc.isPalindrome(str);
		
		assertTrue(actual);
	}

}
