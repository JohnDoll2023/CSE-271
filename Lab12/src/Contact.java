import java.io.Serializable;

public class Contact implements Serializable{
	private String first;
	private String last;
	private String number;
	private String email;
	private String address;
	
	/**
	 * Creates a contact object
	 * @param first the first name of the contact
	 * @param last the last name of the contact
	 * @param number the phone number associated with the contact
	 * @param email the email address associated with the contact
	 * @param address the address of the contact
	 */
	public Contact(String first, String last, String number, String email, String address) {
		this.setFirst(first);
		this.setLast(last);
		this.setNumber(number);
		this.setEmail(email);
		this.setAddress(address);
	}
	
	/**
	 * Gets the first name of the contact
	 * @return the first name
	 */
	public String getFirst() {
		return first;
	}

	/**
	 * Sets the first name of the contact
	 * @param first the new first name
	 */
	public void setFirst(String first) {
		this.first = first;
	}

	/**
	 * Gets the last name of the contact
	 * @return the last name
	 */
	public String getLast() {
		return last;
	}

	/**
	 * Sets the last name of the contact
	 * @param last the new last name of the contact
	 */
	public void setLast(String last) {
		this.last = last;
	}

	/**
	 * gets the phone number of the contact
	 * @return the phone number 
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * Sets the phone number of the contact
	 * @param number the new phone number
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * Gets the email of the contact
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email of the contact
	 * @param email the new email of the contact
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the address of the contact
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets the address of the contact
	 * @param address the new address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Prints out the information associated with the contact
	 */
	public String toString() {
		return getFirst() + " " + getLast() + ", " + getNumber() + ", " + getEmail() + ", " + getAddress(); 
	}
	
	/**
	 * Checks to see if two contact objects are equal based on their first and last names and their phone numbers
	 * @param c1 The contact being checked
	 * @return
	 */
	public boolean equals(Contact c1) {
		if(this.getFirst().equals(c1.getFirst()) && this.getLast().equals(c1.getLast()) && this.getNumber().equals(c1.getNumber()))
			return true;
		return false;
	}	
}
