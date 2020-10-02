import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTester {

	//testing customer constructor
	@Test
	public void testCustomer() {
		Customer c1 = new Customer();
		c1.setLocalId(1001);
		assertEquals(null, c1.getName());
		assertEquals(null, c1.getAddress());
		assertEquals(null, c1.getSSN());
		assertEquals(1001, c1.getLocalId());
	}

	//testing customer constructor
	@Test
	public void testCustomerStringAddressString() {
		Address a1 = new Address(713, "West Auglaize", "Wapak", "OH", "45895");
		Customer c1 = new Customer("John", a1, "123");
		c1.setLocalId(1001);
		assertEquals("John", c1.getName());
		assertTrue(a1.equals(c1.getAddress()));
		assertEquals("123", c1.getSSN());
		assertEquals(1001, c1.getLocalId());
	}

	//testing if customer constructor is equal
	@Test
	public void testCustomerCustomer() {
		Address a1 = new Address(713, "West Auglaize", "Wapak", "OH", "45895");
		Customer c1 = new Customer("John", a1, "123");
		c1.setLocalId(1001);
		Customer c2 = new Customer(c1);
		c2.setLocalId(1002);
		assertEquals(c2.getName(),c1.getName());
		assertTrue(c2.getAddress().equals(c1.getAddress()));
		assertEquals(c2.getSSN(), c1.getSSN());
		assertEquals(1001, c1.getLocalId());
		assertEquals(1002, c2.getLocalId());
	}

	//testing a getter, getId
	@Test
	public void testGetId() {
		Customer c1 = new Customer("John",new Address(713, "West Auglaize", "Wapak", "OH", "45895") , "123");
		c1.setLocalId(1001);
		assertEquals(1001, c1.getID());
	}

	//testing a setter, getName
	@Test
	public void testGetName() {
		Customer c1 = new Customer("John",new Address(713, "West Auglaize", "Wapak", "OH", "45895") , "123");
		assertEquals("John", c1.getName());
	}

	//testing a setter, setName
	@Test
	public void testSetName() {
		Customer c1 = new Customer("John",new Address(713, "West Auglaize", "Wapak", "OH", "45895") , "123");
		c1.setName("Lauren");
		assertEquals("Lauren", c1.getName());
	}

	//testing a getter, getAddress
	@Test
	public void testGetAddress() {
		Address a1 = new Address(713, "West Auglaize", "Wapak", "OH", "45895");
		Customer c1 = new Customer("John", a1, "123");
		assertTrue(a1.equals(c1.getAddress()));
	}

	//testing a setter, setAddress
	@Test
	public void testSetAddress() {
		Customer c1 = new Customer("John", new Address(713, "West Auglaize", "Wapak", "OH", "45895"), "123");
		Address a2 = new Address(715, "West Auglaize", "Lima", "IL", "45056");
		c1.setAddress(a2);
		assertTrue(a2.equals(c1.getAddress()));
	}

	//testing a getter, getSSN
	@Test
	public void testGetSSN() {
		Customer c1 = new Customer("John",new Address(713, "West Auglaize", "Wapak", "OH", "45895") , "123");
		assertEquals("123", c1.getSSN());
	}

	//testing a setter, setSSN
	@Test
	public void testSetSSN() {
		Customer c1 = new Customer("John",new Address(713, "West Auglaize", "Wapak", "OH", "45895") , "123");
		c1.setSSN("456");
		assertEquals("456", c1.getSSN());
	}

	//testing equals method
	@Test
	public void testEqualsCustomer() {
		Customer c1 = new Customer("John",new Address(713, "West Auglaize", "Wapak", "OH", "45895"), "123");
		Customer c2 = new Customer("John",new Address(713, "West Auglaize", "Wapak", "OH", "45895"), "123");
		assertEquals(c1.getName(), c2.getName());
		assertTrue(c1.getAddress().equals(c2.getAddress()));
		assertEquals(c1.getSSN(), c2.getSSN());
		
		Customer c3 = new Customer("John",new Address(713, "West Auglaize", "Wapak", "OH", "45895") , "123");
		Customer c4 = new Customer("Lauren",new Address(713, "West Auglaize", "Wapak", "OH", "45895") , "123");
		assertFalse(c3.getName().equals(c4.getName()));
		assertTrue(c3.getAddress().equals(c4.getAddress()));
		assertEquals(c3.getSSN(), c4.getSSN());
		
		Customer c5 = new Customer("John",new Address(713, "West Auglaize", "Wapak", "OH", "45895") , "123");
		Customer c6 = new Customer("John",new Address(714, "West Auglaize", "Wapak", "OH", "45895") , "123");
		assertEquals(c1.getName(), c2.getName());
		assertFalse(c5.getAddress().equals(c6.getAddress()));
		assertEquals(c1.getSSN(), c2.getSSN());
		
		Customer c7 = new Customer("John",new Address(713, "West Auglaize", "Wapak", "OH", "45895") , "123");
		Customer c8 = new Customer("John",new Address(713, "West Auglaize", "Wapak", "OH", "45895") , "456");
		assertEquals(c7.getName(), c8.getName());
		assertTrue(c7.getAddress().equals(c8.getAddress()));
		assertFalse(c7.getSSN().equals(c8.getSSN()));
	}

	//testing toString method
	@Test
	public void testToString() {
		Customer c1 = new Customer("John",new Address(713, "West Auglaize", "Wapak", "OH", "45895") , "123");
		c1.setLocalId(1001);
		assertEquals("1001, John, 713 West Auglaize, Wapak, OH, 45895, 123",c1.toString());
	}
}