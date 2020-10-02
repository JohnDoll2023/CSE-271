import static org.junit.Assert.*;

import org.junit.Test;

public class RecursionTester {

	@Test
	public void testFactorial() {
		assertEquals(1, Recursion.factorial(0));
		assertEquals(1, Recursion.factorial(1));
		assertEquals(120, Recursion.factorial(5));
	}

	@Test
	public void testPower() {
		assertEquals(25, Recursion.power(5, 2));
		assertEquals(0, Recursion.power(0, 2));
		assertEquals(1, Recursion.power(10, 0));
		assertEquals(41, Recursion.power(41, 1));
	}

	@Test
	public void testSumDigits() {
		assertEquals(0, Recursion.sumDigits(0));
		assertEquals(1, Recursion.sumDigits(1));
		assertEquals(1, Recursion.sumDigits(1000));
		assertEquals(19, Recursion.sumDigits(694));
	}

	@Test
	public void testPrintBackward() {
		Recursion.printBackward("\ndog");
		Recursion.printBackward("\ngod");
		Recursion.printBackward("\na");
		Recursion.printBackward("\n");
	}

	@Test
	public void testIsPalindrome() {
		assertTrue(Recursion.isPalindrome("hannah"));
		assertTrue(Recursion.isPalindrome("hanah"));
		assertTrue(Recursion.isPalindrome("h"));
		assertFalse(Recursion.isPalindrome("hannahs"));
		assertFalse(Recursion.isPalindrome("ha"));
		assertTrue(Recursion.isPalindrome("hh"));
		assertTrue(Recursion.isPalindrome(""));
	}

	@Test
	public void testSumPositive() {
		assertEquals(29, Recursion.sumPositive(new int[] {9, 4, 6, -5, 10}));
		assertEquals(0, Recursion.sumPositive(new int[] {-5, -5, -1, -5, -6}));
		assertEquals(0, Recursion.sumPositive(new int[] {0, 0, 0, 0, 0}));
		assertEquals(15, Recursion.sumPositive(new int[] {1, 2, 3, 4, 5}));
		assertEquals(0, Recursion.sumPositive(new int[] {}));
	}

	@Test
	public void testMax() {
		assertEquals(10, Recursion.max(new int[] {9, 4, 6, -5, 10}));
		assertEquals(9, Recursion.max(new int[] {9}));
		assertEquals(-9, Recursion.max(new int[] {-9}));
		assertEquals(-1, Recursion.max(new int[] {-5, -5, -1, -5, -6}));
		assertEquals(-5, Recursion.max(new int[] {-5, -5, -5, -5, -6}));
		assertEquals(0, Recursion.max(new int[] {0}));
	}
}
