
public class Person {
	private String name;
	private int birth;
	
	/**
	 * Creates a person object with no parameters
	 */
	public Person() {
		this("",0);
	}
	
	/**
	 * Creates a person object with a name and birth year
	 * @param name the name of the person
	 * @param birth The birth year of the person
	 */
	public Person(String name, int birth) {
		this.setName(name);
		this.setBirth(birth);
	}
	
	/**
	 * Returns the name of the person
	 * @return the name of the person
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Create new name for the person
	 * @param name the new name of the person
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns the birth year of the person
	 * @return the birth year of the person
	 */
	public int getBirth() {
		return birth;
	}

	/**
	 * Creates new birth year for the person
	 * @param birth new birth year for the person
	 */
	public void setBirth(int birth) {
		this.birth = birth;
	}
	
	/**
	 * Checks to see if two person objects are equal
	 * @param person the person being passed through with a name and birth year
	 * @return true if all properties are equal and false otherwise
	 */
	public boolean equals(Person person) {
		if(this.name.equals(person.name) && this.birth == person.birth)
			return true;
		return false;
	}
	
	/**
	 * Returns a string with a short description of the person object
	 */
	public String toString() {
		return "I am a person whose name is " + this.name + " and was born in " + this.birth;
	}
}
