package edu.wku.lab10;
import java.util.Scanner;
public class SeriesCalculator {

	public static void main(String[] args) {
		//1. Read Input: the terms number
		System.out.print("Please enter the number of terms in series: ");
		Scanner input = new Scanner(System.in);
		int numOfTerm = input.nextInt();
		input.close();
		computeSeries(numOfTerm);
	}//end main method
	//2. computeSeries method:
	
	public static void computeSeries(int num) {
	//2.1. Create the i/i+2 series: Using for loop to compute each terms
		double sum = 0.0;
		System.out.print("Series: " );
		for (int i = 1; i <= num ; i++) {
			double term = (double) i / (i + 2);//Explicit Type Casting: To ensure the result is double type
			//If you cancel the (double), the result turns to be 0?
			sum += term;
			System.out.print(i + "/" + (i + 2));
	//2.2. Formatting Console Output: Format Specifiers--> floating-point number	
			if(i < num)
				System.out.print(" + ");
		}
	//2.3. Sum each term and print
		System.out.println();//
		System.out.print("Sum of the series: " + sum);
	}
}
