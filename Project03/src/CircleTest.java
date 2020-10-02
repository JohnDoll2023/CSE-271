import static org.junit.Assert.*;

import org.junit.Test;

public class CircleTest {
	private static final double delta = 0.0001;
	@Test
	public void testGetName() {
		Circle c1 = new Circle(5, "Circle");
		assertEquals("Circle", c1.getName());
	}

	@Test
	public void testCircle() {
		Circle c1 = new Circle(5, "Circle");
		assertEquals(5, c1.getRadius(), delta);
		assertEquals("Circle", c1.getName());
	}

	@Test
	public void testGetArea() {
		Circle c1 = new Circle(5, "Circle");
		assertEquals(78.5398, c1.getArea(), delta);
	}

	@Test
	public void testEqualsCircle() {
		Circle c1 = new Circle(5, "Circle");
		Circle c2 = new Circle(5, "Circle");
		assertTrue(c1.getRadius() == c2.getRadius());
		assertTrue(c1.getName().equals(c2.getName()));
		
		Circle c3 = new Circle(5, "Circle");
		Circle c4 = new Circle(6, "Circle");
		assertFalse(c3.getRadius() == c4.getRadius());
		assertTrue(c3.getName().equals(c4.getName()));
		
		Circle c5 = new Circle(5, "Circle");
		Circle c6 = new Circle(5, "Circles");
		assertTrue(c5.getRadius() == c6.getRadius());
		assertFalse(c5.getName().equals(c6.getName()));
	}

	@Test
	public void testToString() {
		Circle c1 = new Circle(5, "Circle");
		assertEquals("Circle [Radius: 5.0]", c1.toString());
	}

	@Test
	public void testGetRadius() {
		Circle c1 = new Circle(5, "Circle");
		assertEquals(5, c1.getRadius(), delta);
	}

	@Test
	public void testSetRadius() {
		Circle c1 = new Circle(5, "Circle");
		c1.setRadius(6);
		assertEquals(6, c1.getRadius(), delta);
	}
}
