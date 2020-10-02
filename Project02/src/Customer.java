/**
 * 
 * @author John Doll
 * Date: March 3, 2020
 * CSE 271 Section A
 */
public class Customer {
	private static int id = 1000;
	private int localId;
	private String name;
	private Address address;
	private String ssn;
	
	/**
	 * Creates a base customer object
	 */
	public Customer() {
		this(null, null, null);
		id++;
		setLocalId(id);
	}

	/**
	 * Creates a customer object
	 * @param name the name of the customer object
	 * @param address the address of the customer object
	 * @param ssn the ssn of the customer object
	 */
	public Customer(String name, Address address, String ssn) {
		id++;
		setLocalId(id);
		setName(name);
		setAddress(address);
		setSSN(ssn);
	}
	
	/**
	 * Creates a copy of the customer object
	 * @param customer the copy customer object
	 */
	public Customer(Customer customer) {
		id++;
		setLocalId(id);
		setName(customer.name);
		setAddress(customer.address);
		setSSN(customer.ssn);
	}
	
	/**
	 * Makes the local id of the customer object
	 * @param id2 the new local id of the customer object
	 */
	public void setLocalId(int id2) {
		localId = id2;
	}
	
	/**
	 * Returns the current localId of the customer object
	 * @return the localId
	 */
	public int getLocalId() {
		return localId;
	}
	
	/**
	 * Returns the id variable
	 * @return id
	 */
	public int getID() {
		return id;
	}

	/**
	 * Returns the name of the customer object
	 * @return the current name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Creates a new name for the customer object
	 * @param name new name for the customer object
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns the address of the customer object
	 * @return the current address of the customer object
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * Creates a new address for the customer object
	 * @param address the new address
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * Returns the ssn of the customer object
	 * @return the ssn
	 */
	public String getSSN() {
		return ssn;
	}

	/**
	 * Creates a new ssn for the customer object
	 * @param ssn the new ssn
	 */
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
	
	/**
	 * Checks to see if two customer objects are equal
	 * @param customer the customer object to be checked
	 * @return true if the customer objects are equal and false otherwise
	 */
	public boolean equals(Customer customer) {
		if(!name.equals(customer.name))
			return false;
		if(!address.equals(customer.address))
			return false;
		if(!ssn.equals(customer.ssn))
			return false;
		return true;
	}
	
	/**
	 * Writes the customer object's traits out as a string
	 */
	public String toString() {
		return getLocalId() + ", " + name + ", " + address.toString() + ", "  + ssn;
	}
}
