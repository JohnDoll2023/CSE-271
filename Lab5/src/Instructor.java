
public class Instructor extends Person{
	private String rank;
	
	/**
	 * Creates an instructor object with no parameters
	 */
	public Instructor() {
		super();
		this.setRank(null);
	}
	
	/**
	 * Creates an instructor object with a name, birth year, and rank
	 * @param name The name of the instructor
	 * @param birth The birth year of the instructor
	 * @param rank The rank of the instructor
	 */
	public Instructor(String name, int birth, String rank) {
		super(name, birth);
		this.setRank(rank);
	}

	/**
	 * Returns the rank of the instructor
	 * @return the rank of the instructor
	 */
	public String getRank() {
		return rank;
	}

	/**
	 * Creates a new rank for the instructor
	 * @param rank the new rank of the instructor
	 */
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	/**
	 * Compares two instructor objects
	 * @param instructor passes through the instructor with parameters of rank, birth year, and name
	 * @return true if all properties are equal and false otherwise
	 */
	public boolean equals(Instructor instructor) {
		if(this.rank.equals(instructor.getRank()) && this.getBirth() == instructor.getBirth() && this.getName().equals(instructor.getName()))
			return true;
		return false;
	}
	
	/**
	 * Returns a string with a short description of the instructor object
	 */
	public String toString() {
		return "I am a " + rank + ". " + super.toString();
	}
}
