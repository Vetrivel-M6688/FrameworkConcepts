package junitPrograms;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertClass {

	@Test
	public void allAssertions() {

		String s1 = new String("Java");
		String s2 = new String("Java");
		String s3 = null;
		String s4 = "JAVA";
		String s5 = "JAVA";
		int val1 = 5;
		int val2 = 6;

		int[] nums1 = { 1, 2, 3 };
		int[] nums2 = { 1, 2, 3 };

		// check both reference pointing to the same object
		assertEquals(s1, s2);

		// check String is not null
		assertNotNull(s1);

		// check String null
		assertNull(s3);

		// check condition true
		assertTrue(val1 < val2);

		// check false condition
		assertFalse(val1 > val2);

		// check both object same
		assertSame(s4, s5);

		// check both object not same
		assertNotSame(s1, s5);
		
		// check both array equal
		assertArrayEquals(nums1, nums2);

	}
}
