import java.io.File;
import java.util.Scanner;

public class printf_full_example{
	public static void main(String[] args) {
		String myFormat = "%-20s %-29s %-1.2f %4d %-25s\n";
		System.out.println("Student Name         Email                        CGPA  Age University                  ");
		System.out.println("-------------------- ---------------------------- ----  --- ----------------------------");
		String firstName, lastName, email, university;
		int age;
		float cgpa;
		
		String line = null;
		
		Scanner scn = null;
		try{
			scn = new Scanner(new File("data.txt"));
			while(scn.hasNextLine()) {
				line = scn.nextLine();
				String [] parts = line.split(",");
				firstName = parts[0];
				lastName = parts[1];
				email = parts[2];
				cgpa = Float.parseFloat(parts[3]);
				age = Integer.parseInt(parts[4]);
				university = parts[5];
				
				System.out.printf(myFormat, firstName + " " + lastName, email, cgpa, age, university);
				
			}
			scn.close();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}		
		
		
		
	}

}
