import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIO {
	public static void main(String [] args) {
		writeCarnivoratoFile(readCarnivoraFromFile("carnivoras.txt"), "output.txt");
	}
	public static Carnivora [] readCarnivoraFromFile(String fileName) {
		Carnivora [] c1 = new Carnivora[5];
		File f = new File("carnivoras.txt");
		Scanner in = null;
		try {
			in = new Scanner(f);
		}
		catch (Exception e) {
			System.out.println("Problem reading file.");
		}
		
		if(!in.hasNextLine())
			return null;
		else {
			int i = 0;
			while(in.hasNextLine()) {
				String s = in.nextLine();
				String [] s1 = s.split(",", 4);
				String [] x = s1[1].split(" ", 3);
				String [] b = s1[3].split(" ", 3);
				c1[i] = new Carnivora(s1[0], Integer.parseInt(x[1]), s1[2], Boolean.parseBoolean(b[1]));
				i++;
			}
		}
		in.close();
		return c1;
	}
	
	public static boolean writeCarnivoratoFile(Carnivora[] carnivoras, String fileName) {
		PrintWriter p1 = null;
		try {
			p1 = new PrintWriter(fileName); 
		}
		
		catch (Exception e) {
			System.out.println("Problem writing to file");
			return false;
		}
		
		for(int i = 0; i < 5; i++) {
			if(!carnivoras[i].isWild)
				p1.println(carnivoras[i] + ".");
			else
				p1.println(carnivoras[i] + " and a wild member.");
		}
		p1.close();
		return true;
	}
}
