import java.util.Scanner;
import java.io.*;

public class Chapter7_23 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File inputFile = new File("./input");
		Scanner fin = null;
		try {
			fin = new Scanner(inputFile);
		}
		catch (Exception e) {
			System.out.println("File not found");
			
		}
		fin.useDelimiter("");
		int countd = 0;
		int countl = 0;
		int countu = 0;
		int countc = 0;
		int countw = 0;
		
		while(fin.hasNext()) {
			String word = fin.next();
			char ch = word.charAt(0);
			if(Character.isDigit(ch))
				countd++;
			else if(Character.isLetter(ch)) {
				countl++;
				if(Character.isUpperCase(ch))
					countu++;
				else
					countc++;
			}
			else if(Character.isWhitespace(ch))
				countw++;
		}
		fin.close();
		System.out.println(countd + "\n" + countl + "\n" + countu + "\n" + countc + "\n" + countw);
	}

}
