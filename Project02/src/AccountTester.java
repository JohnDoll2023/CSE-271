import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTester {
	double delta = 0.0001;
	
	//testing account constructor
	@Test
	public void testAccountCustomer() {
		Customer c1 = new Customer("John", new Address(713, "West Auglaize", "Wapak", "OH", "45895"), "123");
		Account a1 = new Account(c1);
		a1.setInstID(1010);
		c1.setLocalId(1001);
		assertEquals(1010, a1.getInstID());
		assertEquals(1001, c1.getLocalId());
		assertEquals(c1, a1.getCustomer());
		assertEquals(0.0, a1.getBalance(), delta);
	}

	//testing account constructor
	@Test
	public void testAccountCustomerDouble() {
		Customer c1 = new Customer("John", new Address(713, "West Auglaize", "Wapak", "OH", "45895"), "123");
		Account a1 = new Account(c1, 50.0);
		a1.setInstID(1010);
		c1.setLocalId(1001);
		assertEquals(1010, a1.getInstID());
		assertEquals(1001, c1.getLocalId());
		assertEquals(c1, a1.getCustomer());
		assertEquals(50.0, a1.getBalance(), delta);
	}

	//testing account constructors are equal
	@Test
	public void testAccountAccount() {
		Customer c1 = new Customer("John", new Address(713, "West Auglaize", "Wapak", "OH", "45895"), "123");
		Account a1 = new Account(c1, 50.0);
		a1.setInstID(1010);
		c1.setLocalId(1001);
		assertEquals(1010, a1.getInstID());
		assertEquals(1001, c1.getLocalId());
		assertTrue(a1.getCustomer().equals(c1));
		assertEquals(50.0, a1.getBalance(), delta);
		
	}

	//testing deposit method
	@Test
	public void testDeposit() {
		Account a1 = new Account(new Customer("John", new Address(713, "West Auglaize", "Wapak", "OH", "45895"), "123"), 50.0);
		a1.deposit(50);
		assertEquals(100, a1.getBalance(), delta);
	}

	//testing withdraw method
	@Test
	public void testWithdraw() {
		Account a1 = new Account(new Customer("John", new Address(713, "West Auglaize", "Wapak", "OH", "45895"), "123"), 50.0);
		a1.withdraw(10);
		assertEquals(40, a1.getBalance(),delta);
		a1.withdraw(45);
		assertEquals(40, a1.getBalance(),delta);
	}

	//testing that two accounts are equal
	@Test
	public void testEqualsAccount() {
		Account a1 = new Account(new Customer("John", new Address(713, "West Auglaize", "Wapak", "OH", "45895"), "123"), 50.0);
		Account a2 = new Account(new Customer("John", new Address(713, "West Auglaize", "Wapak", "OH", "45895"), "123"), 50.0);
		assertTrue(a1.getCustomer().equals(a2.getCustomer()));
		assertEquals(a1.getBalance(), a2.getBalance(), delta);
		
		Account a3 = new Account(new Customer("Lauren", new Address(713, "West Auglaize", "Wapak", "OH", "45895"), "123"), 50.0);
		assertFalse(a3.getCustomer().equals(a1.getCustomer()));
		assertEquals(a3.getBalance(), a1.getBalance(), delta);
		
		Account a4 = new Account(new Customer("John", new Address(714, "West Auglaize", "Wapak", "OH", "45895"), "123"), 50.0);
		assertFalse(a4.getCustomer().equals(a1.getCustomer()));
		assertEquals(a4.getBalance(), a1.getBalance(), delta);
		
		Account a5 = new Account(new Customer("John", new Address(713, "East Auglaize", "Wapak", "OH", "45895"), "123"), 50.0);
		assertFalse(a5.getCustomer().equals(a1.getCustomer()));
		assertEquals(a5.getBalance(), a1.getBalance(), delta);
		
		Account a6 = new Account(new Customer("John", new Address(713, "West Auglaize", "Lima", "OH", "45895"), "123"), 50.0);
		assertFalse(a6.getCustomer().equals(a1.getCustomer()));
		assertEquals(a6.getBalance(), a1.getBalance(), delta);
		
		Account a7 = new Account(new Customer("John", new Address(713, "West Auglaize", "Wapak", "IL", "45895"), "123"), 50.0);
		assertFalse(a7.getCustomer().equals(a1.getCustomer()));
		assertEquals(a7.getBalance(), a1.getBalance(), delta);
		
		Account a8 = new Account(new Customer("John", new Address(713, "West Auglaize", "Wapak", "OH", "45056"), "123"), 50.0);
		assertFalse(a8.getCustomer().equals(a1.getCustomer()));
		assertEquals(a8.getBalance(), a1.getBalance(), delta);
		
		Account a9 = new Account(new Customer("John", new Address(713, "West Auglaize", "Wapak", "OH", "45895"), "456"), 50.0);
		assertFalse(a9.getCustomer().equals(a1.getCustomer()));
		assertEquals(a9.getBalance(), a1.getBalance(), delta);
		
		Account a10 = new Account(new Customer("John", new Address(713, "West Auglaize", "Wapak", "OH", "45895"), "123"), 50.5);
		assertTrue(a10.getCustomer().equals(a1.getCustomer()));
		assertFalse(a10.getBalance() == a1.getBalance());
	}

	//testing toString method
	@Test
	public void testToString() {
		Account a1 = new Account(new Customer("John", new Address(713, "West Auglaize", "Wapak", "OH", "45895"), "123"), 50.0);
		a1.setInstID(1010);
		a1.getCustomer().setLocalId(1001);
		assertEquals("1010, 1001, John, 713 West Auglaize, Wapak, OH, 45895, 123, 50.0", a1.toString());
	}

	//testing a getter, getId
	@Test
	public void testGetId() {
		Account a1 = new Account(new Customer("John", new Address(713, "West Auglaize", "Wapak", "OH", "45895"), "123"), 50.0);
		a1.setInstID(1010);
		assertEquals(1010, a1.getInstID());
	}

	//testing a getter, getCustomer
	@Test
	public void testGetCustomer() {
		Customer c1 = new Customer("John", new Address(713, "West Auglaize", "Wapak", "OH", "45895"), "123");
		Account a1 = new Account(c1, 50.0);
		assertEquals(c1, a1.getCustomer());
	}

	//testing a setter, setCustomer 
	@Test
	public void testSetCustomer() {
		Account a1 = new Account(new Customer("John", new Address(713, "West Auglaize", "Wapak", "OH", "45895"), "123"), 50.0);
		Customer c1 = new Customer("Lauren", new Address(713, "West Auglaize", "Wapak", "OH", "45895"), "123");
		a1.setCustomer(c1);
		assertTrue(c1.equals(a1.getCustomer()));
	}

	//testing a getter, getBalance 
	@Test
	public void testGetBalance() {
		Account a1 = new Account(new Customer("John", new Address(713, "West Auglaize", "Wapak", "OH", "45895"), "123"), 50.0);
		assertEquals(50, a1.getBalance(), delta);
	}

	//testing a setter, setBalance
	@Test
	public void testSetBalance() {
		Account a1 = new Account(new Customer("John", new Address(713, "West Auglaize", "Wapak", "OH", "45895"), "123"), 50.0);
		a1.setBalance(55);
		assertEquals(55, a1.getBalance(), delta);
		a1.setBalance(-10);
		assertEquals(55, a1.getBalance(), delta);
	}
}