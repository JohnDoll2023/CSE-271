/**
 * Author: John Doll
 * Date: February 14, 2020
 * CSE 271 Section A
 * Project 1
 */

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StringParser {

	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter input filename: ");
		File inputFile = new File(keyboard.next());
		if(inputFile.exists()) {
			System.out.println("Found. What do you want to output? ");
		}
		else {
			System.out.println("File does not exist. Goodbye.");
			System.exit(0);
		}
		System.out.println("1. Raw word list\n2. Palindromes\n3. $100 words");
		System.out.print("Choose: ");
		while (true) {
				switch(keyboard.next()) {
				case "1": 
					System.out.print("Enter output filename: ");
					rawOutput(inputFile, new File(keyboard.next()));
					break;
				case "2":
					System.out.print("Enter output filename: ");
					palindromeOutput(inputFile, new File(keyboard.next()));
					break;
				case "3":
					System.out.print("Enter output filename: ");
					hundredDollarWordOutput(inputFile, new File(keyboard.next()));
					break;
				default:
					System.out.println("Not a valid entry, you must pick either 1, 2, or 3.");
					break;
				}
			}
		}
		
		/**
		 * Copies text from input file to output file
		 * @param in  The file to be read from
		 * @param out The file to be written into
		 */
		public static void rawOutput(File in, File out) {
			Scanner fin = null;
			try {
				fin = new Scanner(in);
			}
			catch (Exception e) {
			}
			PrintWriter writeOut = null;
			try {
				writeOut = new PrintWriter(out);
			}
			catch (Exception e) {
			}
			
			while(fin.hasNext()) {
				writeOut.println(fin.next());
			}
			System.out.println("Finished printing raw word list.");
			writeOut.close();
			fin.close();
		}
		
		/**
		 * Writes palindromes from input file to output file
		 * @param in The file to be read from
		 * @param out The file to be written into
		 */
		public static void palindromeOutput(File in, File out) {
			Scanner fin = null;
			try {
				fin = new Scanner(in);
			}
			catch (Exception e) {
			}
			PrintWriter writeOut = null;
			try {
				writeOut = new PrintWriter(out);
			}
			catch (Exception e) {
			}
			ArrayList <String> palindromes = new ArrayList <> ();
			int count = 0;
			while(fin.hasNext()) {
				String current = cleanup(fin.next());
				if(isPalindrome(current) && !palindromes.contains(current)) {
					palindromes.add(current);
					count++;
				}
			}
			palindromes.sort(null);
			for(int i = 0; i < count; i++) {
				writeOut.println(palindromes.get(i));
			}
			writeOut.close();
			fin.close();
			System.out.println("Finished printing palindromes.");
		}
		
		/**
		 * Writes $100 words from input file to output file
		 * @param in The to be read from
		 * @param out The file being written into
		 */
		public static void hundredDollarWordOutput(File in, File out) {
			Scanner fin = null;
			try {
				fin = new Scanner(in);
			}
			catch (Exception e) {
			}
			PrintWriter writeOut = null;
			try {
				writeOut = new PrintWriter(out);
			}
			catch (Exception e) {
			}
			ArrayList <String> hundred = new ArrayList <> ();
			int count = 0;
			while(fin.hasNext()) {
				String str = cleanup(fin.next());
				if(wordValue(str) == 100 && !hundred.contains(str)) {
					hundred.add(str);
					count++;
				}
			}
			hundred.sort(null);
			for(int i = 0; i < count; i++) {
				writeOut.println(hundred.get(i));
			}
			writeOut.close();
			fin.close();
			System.out.println("Finished printing $100 words.");
		}
		
		/**
		 * Called by palindromeOutput method to determine whether or not a word is a palindrome
		 * @param word The string being evaluated to see if it is a palindrome or not
		 * @return
		 */
		public static boolean isPalindrome(String word) {
			for(int i = 0; i < word.length() + 1 / 2; i++) {
				if(word.charAt(i) != word.charAt(word.length() - i - 1)) {
					return false;
				}	
			}
			return true;
		}
		
		/**
		 * Takes all non-letters off the word and makes it all caps
		 * @param word The word that is being ridden of its non-letters and all remaining characters being made uppercase
		 * @return
		 */
		public static String cleanup(String word) {
			return word.toUpperCase().replaceAll("[^a-zA-Z]", "");
		}
		
		/**
		 * Determines if the word is a $100 word or not
		 * @param word The word being checked to see what its characters alphabetically add up to
		 * @return
		 */
		public static int wordValue(String word) {
			int sum = 0;
			for(int i = 0; i < word.length(); i++) {
				sum += word.charAt(i)-64;
			}
			return sum;
		}
}