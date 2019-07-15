package CalculatorP;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	@Test
	void FindmaxtestNegative() {
		Calculator calc = new Calculator();
		assertEquals(-3,calc.findMax(-3,-5,-7));
	}
	@Test
	void FindmaxtestPositive() {
		Calculator calc = new Calculator();
		assertEquals(3,calc.findMax(3,5,7));
	}
	@Test
	void FindmaxtestZero() {
		Calculator calc = new Calculator();
		assertEquals(0,calc.findMax(0,0,0));
	}
	@Test
	void FindmaxtestZero() {
		Calculator calc = new Calculator();
		assertEquals(0,calc.findMax(0,0,0));
	}
	
	

}
