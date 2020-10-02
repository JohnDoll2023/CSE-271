import static org.junit.Assert.*;

import org.junit.Test;

public class SphereTest {
	public static final double delta = 0.0001;
	
	@Test
	public void testToString() {
		Sphere s1 = new Sphere(4, "Sphere");
		assertEquals("Sphere [Radius: 4.0]", s1.toString());
	}

	@Test
	public void testSphere() {
		Sphere s1 = new Sphere(4, "Sphere");
		assertEquals(4, s1.getRadius(), delta);
		assertEquals("Sphere", s1.getName());
	}

	@Test
	public void testGetVolume() {
		Sphere s1 = new Sphere(4, "Sphere");
		assertEquals(268.08257, s1.getVolume(), delta);
	}
}
