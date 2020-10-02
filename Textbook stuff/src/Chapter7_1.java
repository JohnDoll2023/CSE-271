import java.util.Scanner;
import java.io.*;

public class Chapter7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a input file name: ");
		Scanner fin = null;
		File inputFile;
		
		try {
			inputFile = new File(in.next());
			if(inputFile.createNewFile()) {
				System.out.println("File created");
			}
			else {
				System.out.println("File already exists");
			}
			fin = new Scanner(inputFile);
		}
		catch (Exception e) {
			System.out.println("Error handling file");
		}
		System.out.println("Enter an output file name: ");
		PrintWriter out = null;
		
		
		try {
			out = new PrintWriter(in.next());
		}
		catch (Exception e) {
			System.out.println("File not found");
		}
		
		while(fin.hasNext()) {
			if(fin.next().contains("!") || fin.next().contains(".") || fin.next().contains("?")) {
				out.print(fin.next() + "\n");
			}
			else
				out.print(fin.next() + " ");
		}
		out.println("John Doll");
		if(out != null)
			out.close();
		if(in != null)
			in.close();
	}

}
