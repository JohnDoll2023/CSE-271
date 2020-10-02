import java.util.Scanner;
import java.io.*;

public class Chapter7_2 {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		File inputFile = new File("input.txt");
		Scanner fin = new Scanner(System.in);
		fin.useDelimiter("");
		int count = 0;
		while (fin.hasNextLine()) {
			String word = fin.nextLine();
			word.toLowerCase();
			if(word.equals("a") || word.equals("b") || word.equals("c") || word.equals("d") || word.equals("e")){
				count++;
			}
		}
		System.out.println(count);
	}

}
