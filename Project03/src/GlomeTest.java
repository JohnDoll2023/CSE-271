import static org.junit.Assert.*;

import org.junit.Test;

public class GlomeTest {
	public static final double delta = 0.0001;
	
	@Test
	public void testToString() {
		Glome g1 = new Glome(4, "Glome");
		assertEquals("Glome [Radius: 4.0]", g1.toString());
	}

	@Test
	public void testGetVolume() {
		Glome g1 = new Glome(4, "Glome");
		assertEquals(1263.3093, g1.getVolume(), delta);
	}

	@Test
	public void testGlome() {
		Glome g1 = new Glome(4, "Glome");
		assertEquals(4, g1.getRadius(), delta);
		assertEquals("Glome", g1.getName());
	}
}
