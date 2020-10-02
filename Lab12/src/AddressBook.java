import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Contact> c = new ArrayList<Contact>();
		load(c);
		while(true) {
			System.out.println("Address Book Operations");
			System.out.println("   1) Add");
			System.out.println("   2) Remove");
			System.out.println("   3) Save");
			System.out.println("   4) Load");
			System.out.println("   5) Display All");
			System.out.println("   6) Search");
			System.out.println("   7) Exit");
			System.out.print("Select an option (number): ");
			switch(in.next()) {
			case "1":
				addContact(c);
				break;
			case "2":
				removeContact(c);
				break;
			case "3":
				save(c);
				System.out.println("Contacts saved. \n");
				break;
			case "4":
				if(load(c))
					System.out.println("Contacts loaded. \n");
				else
					System.out.println("No contacts available to be loaded. \n");	
				break;
			case "5":
				display(c);
				break;
			case "6":
				search(c);
				break;
			case "7":
				save(c);
				System.out.println("Goodbye.");
				System.exit(0);
				break;
			default:
				System.out.println("Not a valid entry, you must enter a number 1-7. \n");	
			}
		}
	}
	
	/**
	 * Adds a contact to the address book as long it does not contain the same phone number as a current contact
	 * @param c Contact arrayList
	 */
	public static void addContact(ArrayList<Contact> c) {
		boolean value = false;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the contact's first name: ");
		String first = in.next();
		System.out.print("Enter " + first + "'s last name: ");
		String last = in.next();
		System.out.print("Enter " + first + "'s phone number (123-456-7890): ");
		String number = in.next();
		for(int i = 0; i < c.size(); i++) {
			if(c.get(i).getNumber().equals(number)) {
				System.out.println("A contact with this phone number already exists in your Address Book, contact will not be added. \n");
				value = true;
			}
		}
		if(!value) {
			System.out.print("Enter " + first + "'s email address: ");
			String email = in.next();
			System.out.print("Enter " + first + "'s address: ");
			in.nextLine();
			String address = in.nextLine();
			c.add(new Contact(first, last, number, email, address));
			System.out.println("Contact successfully added. \n");
		}
	}
	
	/**
	 * Removes a contact from the arrayList
	 * @param c Contact arrayList
	 */
	public static void removeContact(ArrayList<Contact> c) {
		if(c.size() == 0)
			System.out.println("Contact list is empty, add contacts first. \n");
		else {
			Scanner in = new Scanner(System.in);
			int location = -1;
			System.out.print("Enter the phone number of the contact you want to remove (123-456-7890): ");
			String number = in.next();
			for(int i = 0; i < c.size(); i++) {
				if(c.get(i).getNumber().equals(number)) {
					location = i;
					break;
				}
			}
			if(location == -1)
				System.out.println("Contact not found. \n");
			else {
				c.remove(location);
				System.out.println("Contact successfully removed. \n");
			}
			save(c);
		}
	}
	
	/**
	 * Saves the contacts to the file
	 * @param c Contact arrayList
	 */
	public static void save(ArrayList<Contact> c) {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("addressbook.dat"));
			oos.writeObject(c);
			oos.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(EOFException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		} 
	}
	
	/**
	 * Loads the data from the file
	 * @param c the arrayList the data will be loaded to
	 * @return true if it loaded correctly and false otherwise
	 */
	public static boolean load(ArrayList<Contact> c) {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("addressbook.dat"));
			ArrayList<Contact> c1 = (ArrayList<Contact>) ois.readObject();
			if(c.size() == 0) {
				for(int i = 0; i < c1.size(); i++) {
					c.add(c1.get(i));
				}
			}
			ois.close();
		}
		catch (FileNotFoundException e) {
			File input = new File("addressbook.dat");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(EOFException e) {
			return false;
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	/**
	 * Displays all the contacts
	 * @param c Contact arrayList
	 */
	public static void display(ArrayList<Contact> c) {
		if(c.size() == 0) 
			System.out.println("Your Address Book is empty. \n");
		else {
			for(int i = 0; i < c.size(); i++) {
				System.out.println(c.get(i).toString());
			}
			System.out.print("\n");
		}
	}
	
	/**
	 * Searches the arrayList for the specified value
	 * @param c Contact arrayList
	 */
	public static void search(ArrayList<Contact> c) {
		if(c.size() == 0)
			System.out.println("Your Address Book is empty. \n");
		else {
			boolean value = false;
			Scanner in = new Scanner(System.in);
			System.out.println("Enter text you want to search for (case sensitive): ");
			String search = in.next();
			System.out.println("These contacts have matching results: ");
			for(int i = 0; i < c.size(); i++) {
				if(c.get(i).getFirst().contains(search)) {
					System.out.println(c.get(i).toString());
					value = true;
				}
				else if(c.get(i).getLast().contains(search)) {
					System.out.println(c.get(i).toString());
					value = true;
				}
				else if(c.get(i).getNumber().contains(search)) {
					System.out.println(c.get(i).toString());
					value = true;
				}
				else if(c.get(i).getEmail().contains(search)) {
					System.out.println(c.get(i).toString());
					value = true;
				}
				else if(c.get(i).getAddress().contains(search)) {
					System.out.println(c.get(i).toString());
				value = true;
				}
			}
			if(!value)
				System.out.println("O contacts contain search input. \n");
			else
				System.out.print("\n");
		}
	}
}