package edu.wku.lab10;
public class Calculator {

	public static void main(String[] args) {
		//1.Test overloading method
		System.out.println("The double of the number 2 is " + Calculate(2));
		System.out.println("The difference of 10 and 5 is " + Calculate(10, 5));
		System.out.println("The product of 10.0 and 5.0 is " + Calculate(10.0, 5.0));
		System.out.println("The result of concatenating two strings Hello and World is " + Calculate("Hello", "World"));
		}//end main method
	
		//2.int Calculate(int)
	public static int Calculate(int value) {
		//get one integer and return by adding the same value.
		value = value + value;
		return value;
	}
		
		//3. int Calculate (int, int)
	public static int Calculate (int value1, int value2) {
		//get two integers and return the first integer minus second integer
		int difference = value1 - value2;
		return difference;
	}
		
		//4. double Calculate (double, double)
	public static double Calculate (double value1, double value2) {
		//get two double variables and return product of these two inputs.
		double product = value1 * value2;
		return product;
	}
		
		//5. String Calculate (string, string)
	public static String Calculate (String String1, String String2) {
		//get two strings and returns the concatenations of these two strings --> concat(s1)function or string + string
		String finalString = String1.concat(String2);
		return finalString;
	}
		

	

}
