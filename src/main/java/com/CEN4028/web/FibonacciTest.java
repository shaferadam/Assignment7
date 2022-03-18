//  I have Jenkins set to look for changes every minute on GitHub. 
//  I included a comment so that Jenkins would rebuild after I push to Github due to this change.

package com.CEN4028.web;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

	@Test(timeout = 100)
	public void testFibonacci()
	
	{
		Fibonacci fibCalculator = new Fibonacci();
		
		assertEquals(0, fibCalculator.fibonacci(0));
		
		assertEquals(1, fibCalculator.fibonacci(1));
		
		assertEquals(55, fibCalculator.fibonacci(10) );
		
		assertEquals(75025, fibCalculator.fibonacci(25) );
		
		assertEquals(12586269025L, fibCalculator.fibonacci(50) );
		
		assertEquals(1548008755920L, fibCalculator.fibonacci(60) );
				
	}

}