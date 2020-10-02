import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	static Scanner in = new Scanner(System.in);
	static ArrayList<Users> list = new ArrayList<Users> ();
	public static void main(String[] args) {
		accountMenu();
	}
	
	public static void accountMenu() {
		boolean condition = true;
		System.out.println("1. Login\n2. Create Account");
		while(condition) {
			switch(in.next()) {
			case "1":
				login();
				condition = false;
				break;
			case "2":
				studentAdmin();
				condition = false;
				break;
			default: 
				System.out.println("Not a valid input, must enter either \"1\" or \"2\".");
				break;
			}
		}
	}
	
	public static void studentAdmin() {
		boolean condition = true;
		while(condition) {
			System.out.println("Are you a student or administrator?");
			String answer = in.next();
			switch(answer.toLowerCase()) {
			case "student":
				createStudent();
				condition = false;
				break;
			case "administrator":
				createAdmin();
				condition = false;
				break;
			default: 
				System.out.println("Not a valid input, must enter either \"student\" or \"administrator\".");
				break;
			}
		}
	}
	
	public static void adminMenu () {
		boolean condition = true;
		System.out.println("1. View all student schedules\n2. View a specific student schedule\n3. Manage a student\n4. Display students\n5. Display admins\n6. Logout");
		while(condition) {
			switch (in.next()) {
			case "1": 
				printSchedules();
				condition = false;
				break;
			case "2":
				printSpecific();
				condition = false;
				break;
			case "3":
				deleteStudent();
				condition = false;
				break;
			case "4":
				displayStudent();
				condition = false;
				break;
			case "5":
				displayAdmin();
				condition = false;
				break;
			case "6":
				accountMenu();
				condition = false;
				break;
			default:
				System.out.println("Not a valid input, must enter either \"1\", \"2\", or \"3\".");
				break;
			}
		}
	}
	
	public static void printSchedules() {
		for(Users test: list) {
			for(People people: test.getIdentity()) {
				if(!people.isAdmin())
					System.out.println("Name: " + people.getFirstName() + " " + people.getLastName() + "  Grade: " + people.getYear());
				for(Class tester: people.getClasses()) {
					System.out.println("Classes: " + tester.getCourses());
				}
			}
		}
	}
	
	public static void printSpecific() {
		System.out.println("Enter student username: ");
		String user = in.next();
		for(Users test: list) {
			if(test.getUsername().equals(user)) {
				for(People people: test.getIdentity()) {
					System.out.println("Name: " + people.getFirstName() + " " + people.getLastName() + "  Grade: " + people.getYear());
					for(Class tester: people.getClasses()) {
						System.out.println("Classes: " + tester.getCourses());
					}
				}
			}
		}
	}
	
	public static void deleteStudent() {
		System.out.println("Enter student username: ");
		String user = in.next();
		System.out.println("Are you sure you want to delete the student? (y/n)");
		if(in.next().equals("y")) {
			//remove student
		}
		else
			adminMenu();
		
		
	}
	
	public static void createStudent() {
		boolean admin = false;
		System.out.println("Enter your first name: ");
		String firstName = in.next();
		System.out.println("Enter your last name: ");
		String lastName = in.next();
		System.out.println("Enter grade (i.e. \"9\" or \"10\".)");
		int year = in.nextInt();
		System.out.println("Enter a username: ");
		String username = in.next();
		System.out.println("Enter a password:");
		String password = in.next();
		ArrayList <People> p1 = new ArrayList<People> ();
		ArrayList<Class> c1 = new ArrayList<Class>();
		
		p1.add(new People(firstName, lastName, year, password, admin, c1));
		list.add(new Users(username, p1));
		System.out.println("Account created.");
		login();
		studentMenu(username, admin);
	}
	
	public static void createAdmin() {
		boolean admin = true;
		System.out.println("Enter your first name: ");
		String firstName = in.next();
		System.out.println("Enter your last name: ");
		String lastName = in.next();
		System.out.println("Enter a username: ");
		String username = in.next();
		System.out.println("Enter a password:");
		String password = in.next();
		ArrayList <People> p1 = new ArrayList<People> ();
		p1.add(new People(firstName, lastName, password, admin));
		list.add(new Users(username, p1));
		System.out.println("Account created.");
		login();
		adminMenu();
	}
	
	public static void login() {
		boolean value = true;
		System.out.println("Login: ");
		boolean condition = true;
		String testP;
		if(list.size() == 0) {
			System.out.println("There are no users!");
			accountMenu();
		}
		else {
			while(condition) {
				System.out.println("Enter username or exit.\n1. Enter username\n2. Exit");
				boolean property = true;
				while(property) {
					switch(in.next()) {
					case "1":
						System.out.println("Enter username:");
						property = false;
						break;
					case "2":
						accountMenu();
						property = false;
						break;
					default:
						System.out.println("Not a valid input, must enter either \"1\" or \"2\".");
						break;
					}
				}
				String testU = in.next();
				for(Users test: list) {
					if(test.getUsername().equals(testU)) {
						System.out.println("Username found.");
						System.out.println("Enter password: ");
						testP = in.next();
						for(People tester: test.getIdentity()) {
							if(tester.getPassword().equals(testP)) {
								if(tester.isAdmin()) {
									System.out.println("Successfully logged in.");
									adminMenu();
									condition = false;
									break;
								}
								else {
									System.out.println("Successfully logged in.");
									value = false;
									studentMenu(testU, value);
									condition = false;
									break;
								}
							}
							else {
								System.out.println("Password incorrect.");
							}
						}
					}
				}	
				System.out.println("Username not found.");
			}
		}
	}
	
	public static void studentMenu(String username, boolean value) {
		boolean condition = true;
		System.out.println("1. Add a class\n2. Remove a class\n3. Logout");
		while(condition) {
			switch(in.next()) {
			case "1":
				addClass(username, value);
				condition = false;
				break;
			case "2":
				removeClass(username, value);
				condition = false;
				break;
			case "3":
				accountMenu();
				condition = false;
				break;
			default:
				System.out.println("Not a valid input, must enter either \"1\" or \"2\".");
				break;	
			}
		}
	}
	
	//Doesn't work
	public static void addClass(String user, boolean value) {
		System.out.println("What class do you want to add?");
		String course = in.next();
		
//		for(int i = 0; i < list.size(); i++) {
//			if(list.get(i).getUsername().equals(user)) {
//				System.out.println("made it");
//				//list.get(i).setIdentity(list.get(i).getIdentity())
//			}
//		for(Users test: list) {
//			test.getIdentity();
//			if(test.getUsername().equals(user)) {
//				for(People people: test.getIdentity()) {
//					for(Class classes: people.getClasses()) {
//						if(!classes.getCourses().equals(course)) {
//							classes.setCourses(course);
//						}
//					}
//				}
//			}
//		}
		
		for(int i = 0; i <= list.size() - 1; i++) {
			if(list.get(i).getUsername().equals(user)) {
				for(int j = 0; j <= list.get(i).getIdentity().size() - 1; j++) {
					System.out.println("made it2");
					list.get(i).getIdentity().get(0).getClasses().get(0).setCourses(course);
					//.get(j).setCourses(course);
				}
//				for(People people: list.get(i).getIdentity()) {
//					System.out.println("made it2");
//					for(Class classes : people.getClasses()) {
//						System.out.println("made it 3");
//						classes.setCourses(course);
//					}
//					
//					for(int j = 0; j <= people.getClasses().size() - 1; j++) {
//						if(i == 0)
//							
//						c1.add(people.getClasses().set());
//					
//					}
				
			}
		}
		
		displayStudent();
		if(value) 
			adminMenu();
		else
			studentMenu(user, value);
	}	
	
	//Doesnt work
	public static void removeClass(String user, boolean value) {
		
	}
	
	public static void displayStudent() {
		for(Users test: list) {
			for(People people: test.getIdentity()) {
				if(!people.isAdmin()) {
					System.out.println("User: " + test.getUsername());
					System.out.println("Name: " + people.getFirstName() + " " + people.getLastName() + "  Grade: " + people.getYear() + "  Password: " + people.getPassword());
					for(Class tester: people.getClasses()) {
						System.out.println("Classes: " + tester.getCourses());
					}
				}
			}
		}
	}
	
	public static void displayAdmin() {
		for(Users test: list) {
			for(People people: test.getIdentity()) {
				if(people.isAdmin()) {
					System.out.println("User: " + test.getUsername());
					System.out.println("Name: " + people.getFirstName() + " " + people.getLastName() + "  Password: " + people.getPassword());
				}
			}
		}
		adminMenu();
	}
}