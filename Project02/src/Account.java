/**
 * 
 * @author John Doll
 * Date: March 3, 2020
 * CSE 271 Section A
 *
 */
public class Account {
	private static int id = 1000;
	private int instID;
	private Customer customer;
	private double balance;
	
	/**
	 * Creates an account using a customer object
	 * @param customer the customer fields being passed through
	 */
	public Account(Customer customer) {
		id += 10;
		setInstID(id);
		setCustomer(customer);
		setBalance(0);
	}
	
	/**
	 * Creates an account object using a customer object and balance
	 * @param customer the customer fields being passed through
	 * @param balance the balance of the account
	 */
	public Account(Customer customer, double balance) {
		id += 10;
		setInstID(id);
		setCustomer(customer);
		setBalance(balance);
	}

	/**
	 * Creates an account object from an existing account object
	 * @param account the account to be copied (excluding id)
	 */
	public Account(Account account) {
		id += 10;
		setInstID(id);
		setCustomer(account.customer);
		setBalance(account.balance);
	}
	
	/**
	 * Adds money to the account balance
	 * @param amount the amount added to the balance
	 */
	public void deposit(double amount) {
		balance += amount;
	}
	
	/**
	 * Subtracts money out of the account
	 * @param amount the amount to be subtracted
	 * @return true if it is possible to subtract amount from the balance and false otherwise
	 */
	public boolean withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
			return true;
		}
		return false;
	}
	
	/**
	 * Checks to see if two Account objects are equal
	 * @param account The account being checked
	 * @return true if the accounts are equal and false otherwise
	 */
	public boolean equals(Account account) {
		if(this.instID != account.getInstID()) 
			return false;
		if(!this.customer.equals(account.customer))
			return false;
		return true;
	}
	
	/**
	 * Creates the id for the account object
	 * @param id2 the id for the account object
	 */
	public void setInstID(int id2) {
		instID =id2;
		
	}
	
	/**
	 * Returns the id of the account object
	 * @return the account id
	 */
	public int getInstID() {
		return instID;
	}
	
	/**
	 * Returns the object as a string
	 */
	public String toString() {
		return this.instID + ", " + customer.toString() + ", " + getBalance();
	}

	/**
	 * Returns the id of the account object
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * returns the customer of the account object
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * Creates the customer object for the account object
	 * @param customer the customer being added to the account
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * Returns the balane of the account object
	 * @return the account balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * Creates the balance of the account object
	 * @param balance the new account balance
	 */
	public void setBalance(double balance) {
		if(balance >= 0)
			this.balance = balance;
	}
}
