import java.util.ArrayList;

public class People {
	private String password;
	private String firstName;
	private String lastName;
	private int year;
	private ArrayList<Class> classes = new ArrayList<Class> ();
	private boolean admin;
	
	public People(String firstName, String lastName, int year, String password, ArrayList<Class> c1, boolean student) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.year = year;
		this.password = password;
		this.classes = c1;
		this.admin = student;
	}
	
	public People(String firstName, String lastName, int year, String password, boolean student, ArrayList<Class> c1) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.year = year;
		this.password = password;
		this.admin = student;
		this.classes = c1;
	}
	
	public People(String firstName, String lastName, String password, boolean admin) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.admin = admin;
	}
	
	public People(ArrayList<Class> c1) {
		this.classes = c1;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public ArrayList<Class> getClasses() {
		return classes;
	}

	public void setClasses(ArrayList<Class> classes) {
		this.classes = classes;
	}
}