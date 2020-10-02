import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * @author John Doll
 * Date: March 3, 2020
 * CSE 271 Section A
 */
public class Project02Driver {

	/**
	 * Main method that asks for filenames and directs file input and output
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Address a1 =  null;
		a1.setCity("OH");
		System.out.println(a1.getCity());
		System.out.print("Enter an output file name: ");
		String output = in.next();
		writeAccountsToFile(readAccountsFromFile("accounts.txt"),output);
	}
	
	/**
	 * This method reads the account information from a file.
	 * @param fileName the file to be read from
	 * @return the Account array
	 */
	public static Account[] readAccountsFromFile (String fileName) {
		File inputFile = new File(fileName);
		Scanner in = null;
		try {
			in = new Scanner(inputFile);
		}
		catch (Exception e) {
			System.out.println("Input file does not exist.");
		}
		if(!in.hasNextLine()) {
			return null;
		}
		else {
			Account [] account = new Account [10];
			for(int i = 0; i < 10; i++) {
				String list = in.nextLine();
				String [] splitList = list.split(",");
				String [] street = splitList[3].split(" ",3);
				String [] balance = splitList[8].split(" ",3);
				account[i] = new Account(new Customer(splitList[2],new Address(Integer.parseInt(street[1]), street[2], splitList[4], splitList[5],splitList[6]), splitList[7]),Double.parseDouble(balance[1]));
			}
			in.close();
			return account;
		}
		
	}
	
	/**
	 * This method writes out the accounts array and its fields to the specified file.
	 * @param accounts the account array being passed through
	 * @param fileName the file being printed to
	 * @return true if it was printed and false otherwise
	 */
	public static boolean writeAccountsToFile(Account[] accounts, String fileName) {
		PrintWriter out = null;
		try {
			out = new PrintWriter(fileName);
		}
		catch (Exception e) {
			System.out.println("File not found.");
		}
		if(accounts[1] != null) {
			for(int i = 0; i < 10; i++) {
				out.println(accounts[i]);
			}
			out.close();
			return true;
		}
		else
			return false;
	}
}
