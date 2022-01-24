package actualCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculationsTest {

	@Test
	public void testAddition() {
	
		Calculations add = new Calculations();
		int expected = 6;
		int actualResult = add.addition(3, 3);
		assertEquals("We got the Unexpected result!!", expected, actualResult);
	}
	
	@Test
	public void testSubtraction() {
		
		Calculations sub = new Calculations();
		int expected = 6;
		assertEquals(expected, sub.subtraction(10, 5));
	}
	
	@Test
	public void testMultiply() {
		
		Calculations mul = new Calculations();
		assertEquals(4, mul.multiply(2, 2));
	}
	
	@Test
	public void testDivide() {
		
		Calculations div = new Calculations();
		assertEquals(div.divide(10, 5), div.divide(10, 2));
	}

}
