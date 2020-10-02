
public class Student extends Person{
	private String major;
	
	/**
	 * Creates a student object with no parameters
	 */
	public Student() {
		super();
		this.setMajor(null);
	}
	
	/**
	 * Creates a student object with name, birth year and major
	 * @param name the name of the student
	 * @param birth The birth year of the student
	 * @param major The major of the student
	 */
	public Student(String name, int birth, String major) {
		super(name, birth);
		this.setMajor(major);
	}

	/**
	 * Returns the major of the student
	 * @return the major of the student
	 */
	public String getMajor() {
		return major;
	}

	/**
	 * Creates a new major for the student
	 * @param major the new major for the student
	 */
	public void setMajor(String major) {
		this.major = major;
	}
	
	/**
	 * Compares two student objects
	 * @param student passes through the student's major, birth year, and name
	 * @return true if all properties are equal and false otherwise
	 */
	public boolean equals(Student student) {
		if(this.major.equals(student.major) && this.getBirth() == student.getBirth() && this.getName().equals(student.getName()))
			return true;
		return false;
	}
	
	/**
	 * Returns a string which describes the student object
	 */
	public String toString() {
		return "I am a student majoring in " + this.major + ". " + super.toString();
	}
}
