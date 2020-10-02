import static org.junit.Assert.*;

import org.junit.Test;

public class CubeTest {
	public static final double delta = 0.0001;
	
	@Test
	public void testToString() {
		Cube c1 = new Cube(3, "Cube");
		assertEquals("Cube [Side: 3.0]", c1.toString());
	}

	@Test
	public void testCube() {
		Cube c1 = new Cube(3, "Cube");
		assertEquals(3, c1.getSide(), delta);
		assertEquals("Cube", c1.getName());
	}

	@Test
	public void testGetVolume() {
		Cube c1 = new Cube(3, "Cube");
		assertEquals(27, c1.getVolume(), delta);
	}

}
