import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {
	public static final double delta = 0.0001;
	
	@Test
	public void testGetName() {
		Square s1 = new Square(4, "Square");
		assertEquals("Square", s1.getName());
	}

	@Test
	public void testSquare() {
		Square s1 = new Square(4, "Square");
		assertEquals("Square", s1.getName());
		assertEquals(4, s1.getSide(), delta);
	}

	@Test
	public void testGetArea() {
		Square s1 = new Square(4, "Square");
		assertEquals(16, s1.getArea(), delta);
	}

	@Test
	public void testEqualsSquare() {
		Square s1 = new Square(4, "Square");
		Square s2 = new Square(4, "Square");
		assertTrue(s1.getSide() == s2.getSide());
		assertTrue(s1.getName().equals(s2.getName()));
		
		Square s3 = new Square(4, "Square");
		Square s4 = new Square(5, "Square");
		assertFalse(s3.getSide() == s4.getSide());
		assertTrue(s3.getName().equals(s4.getName()));
		
		Square s5 = new Square(4, "Square");
		Square s6 = new Square(4, "Squares");
		assertTrue(s5.getSide() == s6.getSide());
		assertFalse(s5.getName().equals(s6.getName()));
	}

	@Test
	public void testToString() {
		Square s1 = new Square(4, "Square");
		assertEquals("Square [Side: 4.0]", s1.toString());
	}

	@Test
	public void testGetSide() {
		Square s1 = new Square(4, "Square");
		assertEquals(4, s1.getSide(), delta);
	}

	@Test
	public void testSetSide() {
		Square s1 = new Square(4, "Square");
		s1.setSide(5);
		assertEquals(5, s1.getSide(), delta);
	}
}
