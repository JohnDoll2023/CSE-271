
import java.util.*;
import java.io.*;

public class FileIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.print("Enter an integer, N : ");
		int N = in.nextInt();
		PrintWriter out = null;
		try
		{
			out = new PrintWriter(new File ("numbers.txt"));
		}
		catch(Exception e)
		{
			System.out.println("problem opening the file");
		}
		
		Random rnd = new Random();
		
		for(int i = 0; i < N; i++) 
			out.println(rnd.nextInt(100));
		out.close();
		
		int [] xNumbers = new int [N];
		Scanner read = null;
		try {
			read = new Scanner(new File("numbers.txt"));
		}
		catch (FileNotFoundException e)
		{
			e.getStackTrace();
			return;
		}
		int i = 0;
		while(read.hasNextInt()) {
			xNumbers[i] = read.nextInt();
			i++;
		}
		PrintWriter out2 = null;
		try
		{
			out2 = new PrintWriter(new File ("output.txt"));
		}
		catch(Exception e)
		{
			System.out.println("problem opening the file");
		}
		
		out2.println("Numbers:");
		out2.println(Arrays.toString(xNumbers));
		Arrays.sort(xNumbers);
		out2.println("Sorted Numbers:");
		out2.println(Arrays.toString(xNumbers));
		int even = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		double add  = 0;
		for(int j = 0; j < N; j++) {
			even = xNumbers[j] % 2 == 0 ? even+1: even;
			max = xNumbers[j] > max ? xNumbers[j]: max;
			min = xNumbers[j] < min ? xNumbers[j]: min;
			add += xNumbers[j];
		}
		double mean = add/N;
		out2.println("\nNumber of odd numbers: " + (N-even));
		out2.println("Number of even numbers: " + even);
		out2.println("Smallest number: " + min);
		out2.println("Largest number: " + max);
		out2.println("Mean:" + mean);
		out2.close();
	}
}
