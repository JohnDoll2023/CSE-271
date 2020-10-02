import java.util.ArrayList;

public class Tester {
	public static void main(String [] args) {
		ArrayList <Book> b1 = new ArrayList <Book> ();
		Book db = new Book("Dummy-Book", 20);
		b1.add(db);
		Book book5 = new Book("Dumb", 30);
		System.out.println(db.compareTo(book5));
		Novel n1 = new Novel("Guns-Of-Navarone", 50, "Adventure", 10);
		b1.add(n1);
		Novel n2 = new Novel("Guns-Of-Navarone", 45, "Adventure", 15);
		b1.add(n2);
		Novel n3 = new Novel("Icarus-Agenda", 35.75, "Mystery", 7);
		b1.add(n3);
		Novel n4 = new Novel("Love-Story", 25.50, "Romance", 8);
		b1.add(n4);
		Textbook t1 = new Textbook("Intro-to-Programming", 75, "Comp-Sci", 10);
		b1.add(t1);
		Textbook t2 = new Textbook("Elements-Of-Calculus", 56, "Mathematics", 15);
		b1.add(t2);
		System.out.println(((Novel)b1.get(1)).equals((Novel)b1.get(2)));
		System.out.println(b1.get(3).equals(b1.get(4)));
		System.out.println(b1.get(5).equals(b1.get(6)));
		if(b1.get(1) instanceof Novel) {
			((Novel)b1.get(1)).setPercent_markup(20);
			System.out.println(((Novel)b1.get(1)).cost());
		}
		else {
			System.out.println("The Book at index 1 is not a Novel.");
		}
		
		if(b1.get(5) instanceof Textbook) {
			((Textbook)b1.get(5)).setPercentage_discount(20);
			System.out.println(((Textbook)b1.get(5)).cost());
		}
		
		for(Book test : b1) {
			System.out.println(test);
		}
	}
}
