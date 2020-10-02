import static org.junit.Assert.*;

import org.junit.Test;

public class AddressTester {

	//testing address constructor
	@Test
	public void testAddressIntStringStringStringString() {
		Address a1 = new Address(713, "West Auglaize", "Wapak", "OH", "45895");
		assertEquals(713, a1.getStreetNumber());
		assertEquals("West Auglaize", a1.getStreetName());
		assertEquals("Wapak", a1.getCity());
		assertEquals("OH", a1.getState());
		assertEquals("45895", a1.getZipCode());
	}

	//testing address constructor
	@Test
	public void testAddress() {
		Address a1 = new Address();
		assertEquals(0, a1.getStreetNumber());
		assertEquals(null, a1.getStreetName());
		assertEquals(null, a1.getCity());
		assertEquals(null, a1.getState());
		assertEquals(null, a1.getZipCode());
	}

	//testing address constructor
	@Test
	public void testAddressAddress() {
		Address a1 = new Address(713, "West Auglaize", "Wapak", "OH", "45895");
		Address a2 = new Address(a1);
		assertEquals(a2.getStreetNumber(), a1.getStreetNumber());
		assertEquals(a2.getStreetName(), a1.getStreetName());
		assertEquals(a2.getCity(), a1.getCity());
		assertEquals(a2.getState(), a1.getState());
		assertEquals(a2.getZipCode(), a1.getZipCode());
		
	}

	//testing a getter, getStreetNumber
	@Test
	public void testGetStreetNumber() {
		Address a1 = new Address(713, "West Auglaize", "Wapak", "OH", "45895");
		assertEquals(713, a1.getStreetNumber());
	}

	//testing a setter, setStreetNumber
	@Test
	public void testSetStreetNumber() {
		Address a1 = new Address(713, "West Auglaize", "Wapak", "OH", "45895");
		a1.setStreetNumber(715);
		assertEquals(715,a1.getStreetNumber());
	}

	//testing a getter, getStreetName
	@Test
	public void testGetStreetName() {
		Address a1 = new Address(713, "West Auglaize", "Wapak", "OH", "45895");
		assertEquals("West Auglaize", a1.getStreetName());
	}

	//testing a setter, setStreetName
	@Test
	public void testSetStreetName() {
		Address a1 = new Address(713, "West Auglaize", "Wapak", "OH", "45895");
		a1.setStreetName("East");
		assertEquals("East", a1.getStreetName());
	}

	//testing a getter, getCity
	@Test
	public void testGetCity() {
		Address a1 = new Address(713, "West Auglaize", "Wapak", "OH", "45895");
		assertEquals("Wapak", a1.getCity());
	}

	//testing a setter, setCity
	@Test
	public void testSetCity() {
		Address a1 = new Address(713, "West Auglaize", "Wapak", "OH", "45895");
		a1.setCity("Lima");
		assertEquals("Lima", a1.getCity());
	}

	//testing a getter, getState
	@Test
	public void testGetState() {
		Address a1 = new Address(713, "West Auglaize", "Wapak", "OH", "45895");
		assertEquals("OH", a1.getState());
	}

	//testing a setter, setState
	@Test
	public void testSetState() {
		Address a1 = new Address(713, "West Auglaize", "Wapak", "OH", "45895");
		a1.setState("IL");
		assertEquals("IL", a1.getState());
	}

	//testing a getter, getZipCode
	@Test
	public void testGetZipCode() {
		Address a1 = new Address(713, "West Auglaize", "Wapak", "OH", "45895");
		assertEquals("45895", a1.getZipCode());
	}

	//testing a setter, setZipCode
	@Test
	public void testSetZipCode() {
		Address a1 = new Address(713, "West Auglaize", "Wapak", "OH", "45895");
		a1.setZipCode("45056");
		assertEquals("45056", a1.getZipCode());
	}

	//testing equals method
	@Test
	public void testEqualsAddress() {
		Address a1 = new Address(713, "West Auglaize", "Wapak", "OH", "45895");
		Address a2 = new Address(713, "West Auglaize", "Wapak", "OH", "45895");
		assertEquals(a1.getStreetNumber(), a2.getStreetNumber());
		assertEquals(a1.getStreetName(), a2.getStreetName());
		assertEquals(a1.getCity(), a2.getCity());
		assertEquals(a1.getState(), a2.getState());
		assertEquals(a1.getZipCode(), a2.getZipCode());
		
		Address a3 = new Address(713, "West Auglaize", "Wapak", "OH", "45895");
		Address a4 = new Address(714, "West Auglaize", "Wapak", "OH", "45895");
		assertFalse(a3.getStreetNumber() == a4.getStreetNumber());
		assertEquals(a3.getStreetName(), a4.getStreetName());
		assertEquals(a3.getCity(), a4.getCity());
		assertEquals(a3.getState(), a4.getState());
		assertEquals(a3.getZipCode(), a4.getZipCode());
		
		Address a5 = new Address(713, "West Auglaize", "Wapak", "OH", "45895");
		Address a6 = new Address(713, "East Auglaize", "Wapak", "OH", "45895");
		assertEquals(a5.getStreetNumber(), a6.getStreetNumber());
		assertFalse(a5.getStreetName().equals(a6.getStreetName()));
		assertEquals(a5.getCity(), a6.getCity());
		assertEquals(a5.getState(), a6.getState());
		assertEquals(a5.getZipCode(), a6.getZipCode());
		
		Address a7 = new Address(713, "West Auglaize", "Wapak", "OH", "45895");
		Address a8 = new Address(713, "West Auglaize", "Lima", "OH", "45895");
		assertEquals(a7.getStreetNumber(), a8.getStreetNumber());
		assertEquals(a7.getStreetName(), a8.getStreetName());
		assertFalse(a7.getCity().equals(a8.getCity()));
		assertEquals(a7.getState(), a8.getState());
		assertEquals(a7.getZipCode(), a8.getZipCode());
		
		Address a9 = new Address(713, "West Auglaize", "Wapak", "OH", "45895");
		Address a10 = new Address(713, "West Auglaize", "Wapak", "Il", "45895");
		assertEquals(a9.getStreetNumber(), a10.getStreetNumber());
		assertEquals(a9.getStreetName(), a10.getStreetName());
		assertEquals(a9.getCity(), a10.getCity());
		assertFalse(a9.getState().equals(a10.getState()));
		assertEquals(a9.getZipCode(), a10.getZipCode());
		
		Address a11 = new Address(713, "West Auglaize", "Wapak", "OH", "45895");
		Address a12 = new Address(713, "West Auglaize", "Wapak", "OH", "45056");
		assertEquals(a11.getStreetNumber(), a12.getStreetNumber());
		assertEquals(a11.getStreetName(), a12.getStreetName());
		assertEquals(a11.getCity(), a12.getCity());
		assertEquals(a11.getState(), a12.getState());
		assertFalse(a11.getZipCode().equals(a12.getZipCode()));
	}

	//testing toString method
	@Test
	public void testToString() {
		Address a1 = new Address(713, "West Auglaize", "Wapak", "OH", "45895");
		assertEquals("713 West Auglaize, Wapak, OH, 45895", a1.toString());
	}
}