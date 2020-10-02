
public class Employee extends Person {
	private double salary;
	
	/**
	 * Creates an employee object with no parameters
	 */
	public Employee() {
		super();
		this.setSalary(0);
	}
	
	/**
	 * Creates an employee object with a name, birth year and salary
	 * @param name The name of the employee
	 * @param birth The birth year of the employee
	 * @param salary The salary of the employee
	 */
	public Employee(String name, int birth, double salary) {
		super(name, birth);
		this.setSalary(salary);
	}
	
	/**
	 * Compares two employee objects to see if all parameters are equal
	 * @param employee passes through object with salary, name, and birth year
	 * @return true if all parameters are equal and false otherwise
	 */
	public boolean equals(Employee employee) {
		if(this.getSalary() == employee.getSalary() && this.getName().equals(employee.getName()) && this.getBirth() == employee.getBirth())
			return true;
		return false;
	}
	
	/**
	 * Returns the salary of the employee
	 * @return the salary of the employee
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * Sets a new salary for the employee
	 * @param salary the new salary for the employee
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	/**
	 * Returns a string with information about the employee object
	 */
	public String toString() {
		return "I am an employee and have a salary of $" + salary + ". " + super.toString();
	}	
}
