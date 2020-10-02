import java.util.Arrays;

public class Recursion {
	public static void main(String [] args) {
		System.out.println(factorial(2));
		System.out.println(power(5,2));
		System.out.println(sumDigits(7));
		printBackward("dogs");
		System.out.println("\n" + isPalindrome("hannah"));
		int[] x = new int[] {9, 4, 6, -5, 10};
		System.out.println(sumPositive(x));
		System.out.println(max(x));
	}
	
	/**
	 * Calculates the factorial of the int input
	 * @param n the number whose factorial is being calculated
	 * @return factorial n
	 */
	public static int factorial(int n) {
		if(n <= 1)
			return 1;
		return n * factorial(n-1);
	}
	
	/**
	 * Calculates a number to a power
	 * @param x the base
	 * @param n the exponent
	 * @return x to the n power
	 */
	public static int power(int x, int n) {
		if(n == 0)
			return 1;
		return x * power(x, n-1);
	}
	
	/**
	 * Adds up each digit individually in a number
	 * @param n the number whose digits will be added
	 * @return the sum of the digits
	 */
	public static int sumDigits(int n) {
		if(n<10) 
			return n;
		return n%10 + sumDigits(n/10); 
	}
	
	/**
	 * Prints a word backwards
	 * @param word the word to be printed backward
	 */
	public static void printBackward(String word) {
		if(word.length()<=1) 
			System.out.print(word);
		else {
			System.out.print(word.substring(word.length()-1));
			printBackward(word.substring(0,word.length()-1));
		}
	}
	
	/**
	 * Determines whether a word is a palindrome or not
	 * @param word the word to be tested
	 * @return true if it a palindrome and false otherwise
	 */
	public static boolean isPalindrome(String word) {
		if(word.length() == 0)
			return true;
		if(word.charAt(0) == word.charAt(word.length()-1)) {
			if(word.length() >= 3) 
				isPalindrome(word.substring(1, word.length()-1));
			return true;
		}
		return false;
	}
	
	/**
	 * Totals the positive numbers in an integer array
	 * @param array the array to be summed
	 * @return the sum of the positive elements in the array
	 */
	public static int sumPositive(int[] array) {
		if(array.length == 0)
			return  0;
		if(array[0] > 0) 
			return array[0] + sumPositive(Arrays.copyOfRange(array, 1, array.length));
		return sumPositive(Arrays.copyOfRange(array, 1, array.length));
	}
	
	/**
	 * Finds the max int in an array
	 * @param array the array to be searched
	 * @return the max element
	 */
	public static int max(int[] array) {
		if(array.length == 0) {
			return Integer.MIN_VALUE;
		}
		if(array[0] > max(Arrays.copyOfRange(array, 1, array.length))) {
			return array[0];
		}
		return max(Arrays.copyOfRange(array, 1, array.length));
	}
}