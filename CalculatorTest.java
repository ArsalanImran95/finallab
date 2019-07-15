package CalculatorP;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	@Test
	void FindmaxtestNegativeNumbers() {
		Calculator calc = new Calculator();
		assertEquals(-1,calc.findMax(-1,-6,-9));
	}
	@Test
	void FindmaxtestPositiveNumbers() {
		Calculator calc = new Calculator();
		// going for failure. 
		assertEquals(2,calc.findMax(2,9,6));
	}
	@Test
	void FindmaxtestEqualNumbers() {
		Calculator calc = new Calculator();
		assertEquals(2,calc.findMax(2,2,2));
	}
	@Test
	void FindmaxtestZeroNumber() {
		Calculator calc = new Calculator();
		assertEquals(0,calc.findMax(0,0,0));
	}
	@Test
	void FindmaxtestThreeDigitNumber() {
		Calculator calc = new Calculator();
		assertEquals(102,calc.findMax(100,101,102));
	}
	@Test
	void FindmaxtestLargeNumber() {
		Calculator calc = new Calculator();
		assertEquals(10000,calc.findMax(100,1000,10000));
	}
	
	

}