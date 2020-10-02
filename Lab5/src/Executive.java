
public class Executive extends Manager{
	private String office;
	
	/**
	 * Generates an executive object with no parameters
	 */
	public Executive() {
		super();
		this.setOffice(office);
	}
	
	/**
	 * Creates the executive object with the given inputs
	 * @param name The name of the executive
	 * @param birth The year the executive was born
	 * @param salary The salary of the executive
	 * @param department The department of the executive
	 * @param office The office of the executive
	 */
	public Executive(String name, int birth, double salary, String department, String office) {
		super(name, birth, salary, department);
		this.setOffice(office);
	}
	
	/**
	 * Compares two executive objects, returns true if executives are exactly the same
	 * @param executive An object with a salary, name, birth year, office and department
	 * @return
	 */
	public boolean equals(Executive executive) {
		if(this.getSalary() == executive.getSalary() && this.getName().equals(executive.getName()) && this.getBirth() == executive.getBirth() && this.office.equals(executive.office) && this.getDepartment().equals(executive.getDepartment()))
			return true;
		return false;
	}
	
	/**
	 * Returns the office where the executive works
	 * @return the office where the executive works
	 */
	public String getOffice() {
		return office;
	}
	
	/**
	 * Sets the office variable
	 * @param office The office room in which the executive works
	 */
	public void setOffice(String office) {
		this.office = office;
	}
	
	/**
	 * Returns a short description in sentence form of the data held within the object
	 */
	public String toString() {
		return "I am an executive and my office location is " + office + ". " + super.toString();
	}
	
}
