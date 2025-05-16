package com.dlv.beans.test;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.dlv.beans.PalindromeCheck;

public class PalindromeTest {
	
	@ParameterizedTest
	@ValueSource(strings= {"malayalam","racecar","madam","liril","raghu"})
	public void testIsPalindrome(String str) {
		
		PalindromeCheck pc=new PalindromeCheck();
		
		boolean actual = pc.isPalindrome(str);
		
		assertTrue(actual);
	}

}
