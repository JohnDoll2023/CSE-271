package lab1;

import java.util.Scanner;
import java.util.Arrays;

public class GradeStatistics {

	public static void main(String[] args) {
		double [] gradebook = populateGrades();
		System.out.print("The grades are: ");
		printGrades(gradebook);
		sortGrades(gradebook);
		System.out.printf("The sorted grades are: ");
		printGrades(gradebook);
		System.out.println(getMean(gradebook));
		System.out.println(getMedian(gradebook));
		double [] MinMax = getMinMax(gradebook);
		System.out.print("Min = " + MinMax[0]);
		System.out.print(" Max = " + MinMax[1]);
	}
	
	public static double [] populateGrades() {
		Scanner in = new Scanner(System.in);
		System.out.print("How many students do you have in the class: ");
		int students = in.nextInt();
		double [] grades = new double[students];
		for(int i = 1; i <= students; i++) {
			System.out.print("Enter grade of student " + i + ": ");
			grades[i-1] = in.nextDouble();
		}
		return grades;	
	}
	
	public static void sortGrades(double grades[]) {
		Arrays.sort(grades);
	}
	
	public static double getMean(double grades[]) {
		double add = 0;
		for(int i = 0; i < grades.length; i++)
			add += grades[i];
		System.out.print("Mean = ");
		return add/(grades.length);
	}
	
	public static double getMedian(double grades[]) {
		double median = 0;
		if(grades.length % 2 == 0) 
			median = (grades[grades.length/2 - 1] + grades[grades.length/2])/2;
		else
			median = grades[(grades.length - 1)/2];
		System.out.print("Median = ");
		return median;
	}
	
	public static double[] getMinMax(double grades[]) {
		double max = Integer.MIN_VALUE;
		double min = Integer.MAX_VALUE;
		for(int i = 0; i < grades.length; i++) {
			if(grades[i] < min)
				min = grades[i];
			if(grades[i] > max)
				max = grades[i];
		}
		double [] minMax = {min,max};
		return minMax;
	}
	
	public static void printGrades(double grades[]) {
		for(int i = 0; i < grades.length; i++) {
			System.out.print(grades[i]);
			if(i + 1 < grades.length) 
				System.out.print(", ");
		}
		System.out.printf("\n");
		
	}

}
