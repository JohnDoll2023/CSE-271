
public class Manager extends Employee{
	private String department;
	
	/**
	 * Generates a manager with no parameters
	 */
	public Manager() {
		super();
		this.setDepartment(null);
	}
	
	/**
	 * Generates a manager object with a name, salary, birth year, and department
	 * @param name The name of the manager
	 * @param salary The salary of the manager
	 * @param birth The birth year of the manager
	 * @param department The department of the manager
	 */
	public Manager(String name, int birth, double salary, String department) {
		super(name, birth, salary);
		this.setDepartment(department);
	}
	
	/**
	 * Returns the department of the manager
	 * @return the department of the manager
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * Sets the department of the manager
	 * @param department The new department of the manager
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	
	/**
	 * Checks to see if two manager objects equal each other
	 * @param manager passes through the object manager with a salary, name, birth year, and department
	 * @return true if the managers are equal and false otherwise
	 */
	public boolean equals(Manager manager) {
		if(this.getSalary() == manager.getSalary() && this.getName().equals(manager.getName()) && this.getBirth() == manager.getBirth() && this.department.equals(manager.department))
			return true;
		return false;
	}
	
	/**
	 * Returns a string that describes the manager object
	 */
	public String toString() {
		return "I am a manager of the " + this.department + " department. " + super.toString();
	}
}
