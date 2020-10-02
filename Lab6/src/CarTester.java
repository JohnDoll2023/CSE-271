/**
 * Author: John Doll
 * Lab: 6
 * Date: March 2, 2020
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class CarTester {

	public static final double delta = 0.00001;
	
	//testing car constructor
	@Test
	public void testCar() {
		Car c1 = new Car();
		assertEquals(null, c1.getOwner());
		assertEquals(null, c1.getMake());
		assertEquals(null, c1.getModel());
		assertEquals(2020, c1.getYearModel());
		assertEquals(1.0, c1.getFuelLevel(), delta);
		assertEquals(0, c1.getSpeed());
		assertFalse(c1.getStart());
	}

	//testing car constructor
	@Test
	public void testCarStringStringStringInt() {
		Car c1 = new Car("john", "honda", "pilot", 2020);
		assertEquals("john", c1.getOwner());
		assertEquals("honda", c1.getMake());
		assertEquals("pilot", c1.getModel());
		assertEquals(2020, c1.getYearModel());
	}

	//testing car constructor
	@Test
	public void testCarStringStringStringIntDouble() {
		Car c1 = new Car("john", "honda", "pilot", 2020, 1.0f);
		assertEquals("john", c1.getOwner());
		assertEquals("honda", c1.getMake());
		assertEquals("pilot", c1.getModel());
		assertEquals(2020, c1.getYearModel());
		assertEquals(1.0, c1.getFuelLevel(), delta);
	}

	//testing car constructor
	@Test
	public void testCarStringStringStringIntDoubleIntBoolean() {
		Car c1 = new Car("john", "honda", "pilot", 2020, 1.0f, 20, false);
		assertEquals("john", c1.getOwner());
		assertEquals("honda", c1.getMake());
		assertEquals("pilot", c1.getModel());
		assertEquals(2020, c1.getYearModel());
		assertEquals(1.0, c1.getFuelLevel(), delta);
		assertEquals(20, c1.getSpeed());
		assertFalse(c1.getStart());
	}

	//testing car constructors are equal
	@Test
	public void testCarCar() {
		Car c1 = new Car("john", "honda", "pilot", 2020, 1.0f, 20, false);
		Car c2 = new Car(c1);
		assertEquals(c2.getOwner(), c1.getOwner());
		assertEquals(c2.getMake(), c1.getMake());
		assertEquals(c2.getModel(), c1.getModel());
		assertEquals(c2.getYearModel(), c1.getYearModel());
		assertEquals(c2.getFuelLevel(), c1.getFuelLevel(), delta);
		assertEquals(c2.getSpeed(), c1.getSpeed());
		assertFalse(c2.getStart());
	}

	//testing a getter, getOwner()
	@Test
	public void testGetOwner() {
		Car c1 = new Car("john", "honda", "pilot", 2020, 1.0f, 20, false);
		assertEquals("john", c1.getOwner());
	}

	//testing a setter, setOwner()
	@Test
	public void testSetOwner() {
		Car c1 = new Car();
		c1.setOwner("john");
		assertEquals("john", c1.getOwner());
	}

	//testing a getter, getMake()
	@Test
	public void testGetMake() {
		Car c1 = new Car("john", "honda", "pilot", 2020, 1.0f, 20, false);
		assertEquals("honda", c1.getMake());
	}

	//testing a setter, setMake()
	@Test
	public void testSetMake() {
		Car c1 = new Car();
		c1.setMake("honda");
		assertEquals("honda", c1.getMake());
	}

	//testing a getter, getModel()
	@Test
	public void testGetModel() {
		Car c1 = new Car("john", "honda", "pilot", 2020, 1.0f, 20, false);
		assertEquals("pilot", c1.getModel());
	}

	//testing a setter, setModel()
	@Test
	public void testSetModel() {
		Car c1 = new Car();
		c1.setModel("pilot");
		assertEquals("pilot", c1.getModel());
	}

	//testing a getter, getYearModel()
	@Test
	public void testGetYearModel() {
		Car c1 = new Car("john", "honda", "pilot", 2020, 1.0f, 20, false);
		assertEquals(2020, c1.getYearModel());
	}

	//testing a setter, setYearModel()
	@Test
	public void testSetYearModel() {
		Car c1 = new Car();
		c1.setYearModel(2020);
		assertEquals(2020, c1.getYearModel());
	}

	//testing a getter, getFuelLevel()
	@Test
	public void testGetFuelLevel() {
		Car c1 = new Car("john", "honda", "pilot", 2020, 1.0f, 20, false);
		assertEquals(1.0, c1.getFuelLevel(), delta);
	}

	//testing a setter, setFuelLevel()
	@Test
	public void testSetFuelLevel() {
		Car c1 = new Car();
		c1.setFuelLevel(1.0f);
		assertEquals(1.0, c1.getFuelLevel(), delta);
	}

	//testing a getter, getSpeed()
	@Test
	public void testGetSpeed() {
		Car c1 = new Car("john", "honda", "pilot", 2020, 1.0f, 20, false);
		assertEquals(20, c1.getSpeed());
	}
	
	//testing a setter, setSpeed()
	@Test
	public void testSetSpeed() {
		Car c1 = new Car();
		c1.setSpeed(20);
		assertEquals(20, c1.getSpeed());
	}

	//testing a getter, getStart()
	@Test
	public void testGetStart() {
		Car c1 = new Car("john", "honda", "pilot", 2020, 1.0f, 20, false);
		assertFalse(c1.getStart());
	}

	//testing a setter, setStart()
	@Test
	public void testSetStart() {
		Car c1 = new Car();
		c1.setStart(true);
		assertTrue(c1.getStart());
	}

	//testing toString method
	@Test
	public void testToString() {
		Car c1 = new Car("john", "honda", "pilot", 2020, 1.0f, 20, false);
		assertEquals("Owner: john, Make: honda, Model: pilot, Year: 2020, Speed: 20, Fuel Level: 1.0", c1.toString());
	}

	//testing accelerate() method
	@Test
	public void testAccelerate() {
		Car c1 = new Car("john", "honda", "pilot", 2020, 1.0f, 20, true);
		c1.accelerate();
		assertEquals(24, c1.getSpeed());
		
		Car c2 = new Car("john", "honda", "pilot", 2020, 1.0f, 249, true);
		c2.accelerate();
		assertEquals(250, c2.getSpeed());
		
		Car c3 = new Car("john", "honda", "pilot", 2020, 0.0f, 20, true);
		c3.accelerate();
		assertEquals(20, c3.getSpeed());
		
		Car c4 = new Car("john", "honda", "pilot", 2020, 1.0f, 20, false);
		c4.accelerate();
		assertEquals(20, c4.getSpeed());
	}

	//testing brake() method
	@Test
	public void testBrake() {
		Car c1 = new Car("john", "honda", "pilot", 2020, 1.0f, 20, true);
		c1.brake();
		assertEquals(17, c1.getSpeed());
		
		Car c2 = new Car("john", "honda", "pilot", 2020, 1.0f, 2, true);
		c2.brake();
		assertEquals(0, c2.getSpeed());
		
		Car c3 = new Car("john", "honda", "pilot", 2020, 1.0f, 20, false);
		c3.brake();
		assertEquals(20, c3.getSpeed());
	}

	//testing isGasTankEmpty() method
	@Test
	public void testIsGasTankEmpty() {
		Car c1 = new Car("john", "honda", "pilot", 2020, 0.0f, 20, true);
		assertTrue(c1.isGasTankEmpty());
		
		Car c2 = new Car("john", "honda", "pilot", 2020, 1.0f, 20, true);
		assertFalse(c2.isGasTankEmpty());
	}

	//testing sameOwner() method
	@Test
	public void testSameOwner() {
		Car c1 = new Car("john", "honda", "pilot", 2020, 0.0f, 20, true);
		Car c2 = new Car("john", "honda", "pilot", 2020, 0.0f, 20, true);
		assertTrue(c1.sameOwner(c2));
		
		Car c3 = new Car("john", "honda", "pilot", 2020, 0.0f, 20, true);
		Car c4 = new Car("lauren", "honda", "pilot", 2020, 0.0f, 20, true);
		assertFalse(c3.sameOwner(c4));
		
	}

	//testing equals() method
	@Test
	public void testEqualsCar() {
		Car c1 = new Car("john", "honda", "pilot", 2020, 0.0f, 20, true);
		Car c2 = new Car("john", "honda", "pilot", 2020, 0.0f, 20, true);
		assertTrue(c1.getMake().equals(c2.getMake()));
		assertTrue(c1.getModel().equals(c2.getModel()));
		assertTrue(c1.getYearModel() == c2.getYearModel());
		
		Car c3 = new Car("john", "ferrari", "pilot", 2020, 0.0f, 20, true);
		Car c4 = new Car("lauren", "honda", "pilot", 2020, 0.0f, 20, true);
		assertFalse(c3.getMake().equals(c4.getMake()));
		assertTrue(c3.getModel().equals(c4.getModel()));
		assertTrue(c3.getYearModel() == c4.getYearModel());
		
		Car c5 = new Car("john", "honda", "civic", 2020, 0.0f, 20, true);
		Car c6 = new Car("john", "honda", "pilot", 2020, 0.0f, 20, true);
		assertTrue(c5.getMake().equals(c6.getMake()));
		assertFalse(c5.getModel().equals(c6.getModel()));
		assertTrue(c5.getYearModel() == c6.getYearModel());
		
		Car c7 = new Car("john", "honda", "pilot", 2020, 0.0f, 20, true);
		Car c8 = new Car("john", "honda", "pilot", 2019, 0.0f, 20, true);
		assertTrue(c7.getMake().equals(c8.getMake()));
		assertTrue(c7.getModel().equals(c8.getModel()));
		assertFalse(c7.getYearModel() == c8.getYearModel());
	}
	
	//testing a setter for illegal arguments, setYearModel()
	@Test(expected=IllegalArgumentException.class)
	public void testSetYearModelException() {
		Car c1 = new Car();
		c1.setYearModel(1);
	}
	
	//testing a setter for illegal arguments, setFuelLevel()
	@Test(expected=IllegalArgumentException.class)
	public void testSetFuelLevelException() {
		Car c1 = new Car();
		c1.setFuelLevel(50.0f);
	}
	
	//testing a setter for illegal arguments, setSpeed()
	@Test(expected=IllegalArgumentException.class)
	public void testSetSpeedException() {
		Car c1 = new Car();
		c1.setSpeed(500);
	}

}
