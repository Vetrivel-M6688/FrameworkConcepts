package actualCodeTest;

import static org.junit.Assert.*;

import org.junit.Test;

import actualCode.AssertsTypes;

public class AssertsTypesTest {

	@Test
	public void testAssertEqualCheck() {
		
		AssertsTypes at = new AssertsTypes();
		int expected = 5;
		assertEquals(expected, at.assertEqualCheck(4, 1));
	}

	@Test
	public void testAssertSameCheck() {
		
		AssertsTypes at=  new AssertsTypes();
		String expected = "Vetri";
		assertSame(expected, at.assertSameCheck("Vetri"));
	}
	
	@Test
	public void testAssertNullCheck() {
		
		AssertsTypes at = new AssertsTypes();
		assertNull(at.assertNullCheck(null));
	}
	
	@Test
	public void testAssertNotNullCheck() {
		
		AssertsTypes at = new AssertsTypes();
		assertNotNull(at.assertNullCheck(null));
	}
	
	@Test
	public void testAssertTrueCheck() {
		
		AssertsTypes at = new AssertsTypes();
		boolean actual = at.assertTrueCheck();
		assertTrue(actual);
	}
	
	@Test
	public void testAssetFasleCheck() {
		
		AssertsTypes at = new AssertsTypes();
		assertFalse(at.assertFalseCheck());
	}

}
