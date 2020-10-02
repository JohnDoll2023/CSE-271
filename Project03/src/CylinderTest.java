import static org.junit.Assert.*;

import org.junit.Test;

public class CylinderTest {
	public static final double delta = 0.0001;
	
	@Test
	public void testToString() {
		Cylinder c1 = new Cylinder(5, 5, "Cylinder");
		assertEquals("Cylinder [Radius: 5.0 Height: 5.0]", c1.toString());
	}

	@Test
	public void testCylinder() {
		Cylinder c1 = new Cylinder(5, 5, "Cylinder");
		assertEquals(5, c1.getHeight(), delta);
		assertEquals(5, c1.getRadius(), delta);
		assertEquals("Cylinder", c1.getName());
	}

	@Test
	public void testGetVolume() {
		Cylinder c1 = new Cylinder(5, 5, "Cylinder");
		assertEquals(392.69908, c1.getVolume(), delta);
	}

	@Test
	public void testEqualsCylinder() {
		Cylinder c1 = new Cylinder(5, 5, "Cylinder");
		Cylinder c2 = new Cylinder(5, 5, "Cylinder");
		assertTrue(c1.getRadius() == c2.getRadius());
		assertTrue(c1.getHeight() == c2.getHeight());
		assertTrue(c1.getName().equals(c2.getName()));
		
		Cylinder c3 = new Cylinder(6, 5, "Cylinder");
		Cylinder c4 = new Cylinder(5, 5, "Cylinder");
		assertTrue(c3.getRadius() == c4.getRadius());
		assertFalse(c3.getHeight() == c4.getHeight());
		assertTrue(c3.getName().equals(c4.getName()));
		
		Cylinder c5 = new Cylinder(5, 5, "Cylinder");
		Cylinder c6 = new Cylinder(5, 6, "Cylinder");
		assertFalse(c5.getRadius() == c6.getRadius());
		assertTrue(c5.getHeight() == c6.getHeight());
		assertTrue(c5.getName().equals(c6.getName()));
		
		Cylinder c7 = new Cylinder(5, 5, "Cylinder");
		Cylinder c8 = new Cylinder(5, 5, "Cylinders");
		assertTrue(c7.getRadius() == c8.getRadius());
		assertTrue(c7.getHeight() == c8.getHeight());
		assertFalse(c7.getName().equals(c8.getName()));
	}

	@Test
	public void testGetHeight() {
		Cylinder c1 = new Cylinder(5, 5, "Cylinder");
		assertEquals(5, c1.getHeight(), delta);
	}

	@Test
	public void testSetHeight() {
		Cylinder c1 = new Cylinder(5, 5, "Cylinder");
		c1.setHeight(6);
		assertEquals(6, c1.getHeight(), delta);
	}

}
