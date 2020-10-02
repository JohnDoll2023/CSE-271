/**
 * 
 * @author John Doll
 * Date: March 3, 2020
 * CSE 271 Section A
 *
 */
public class Address {
	private int streetNumber;
	private String streetName;
	private String city;
	private String state;
	private String zipCode;

	/**
	 * Creates a new Address object
	 * @param streetNumber the street number of the address object
	 * @param streetName the street name of the address object
	 * @param city the city of the address object
	 * @param state the state of the address object
	 * @param zipCode the zip code of the address object
	 */
	public Address(int streetNumber, String streetName, String city, String state, String zipCode) {
		setStreetNumber(streetNumber);
		setStreetName(streetName);
		setCity(city);
		setState(state);
		setZipCode(zipCode);
		}
	
	/**
	 * Creates a null address object
	 */
	public Address() {
		this(0, null, null, null, null);
	}
	
	/**
	 * Creates a copy address object
	 * @param address the address to be copied
	 */
	public Address(Address address) {
		setStreetNumber(address.streetNumber);
		setStreetName(address.streetName);
		setCity(address.city);
		setState(address.state);
		setZipCode(address.zipCode);
	}

	/**
	 * Returns the street number of the address object
	 * @return the street number
	 */
	public int getStreetNumber() {
		return streetNumber;
	}

	/**
	 * Creates a new street number for the address object
	 * @param streetNumber the new street number
	 */
	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	/**
	 * Returns the street name of the address object
	 * @return the street name
	 */
	public String getStreetName() {
		return streetName;
	}

	/**
	 * Creates a new street name of the address object
	 * @param streetName the new street name
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	/**
	 * returns the city of the address object
	 * @return the current city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Creates a new city for the address object
	 * @param city the new city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Returns the state of the address object
	 * @return the current state
	 */
	public String getState() {
		return state;
	}

	/**
	 * Creates a new state for the address object
	 * @param state the new state
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * The zip code of the address object
	 * @return the current zipcode
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * Creates a new zip code for the address object
	 * @param zipCode the new zip code
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	/**
	 * Tests if two address objects are equal
	 * @param address the address to be checked
	 * @return true if the address objects are equal and false otherwise
	 */
	public boolean equals(Address address) {
		if(streetNumber != address.streetNumber)
			return false;
		if(!streetName.equals(address.streetName))
			return false;
		if(!city.equals(address.city))
			return false;
		if(!state.equals(address.state))
			return false;
		if(!zipCode.equals(address.zipCode))
			return false;
		return true;
	}
	
	/**
	 * Writes out the address object as a string
	 */
	public String toString() {
		return streetNumber + " " + streetName + ", " + city + ", " + state + ", " + zipCode;
	}
}
