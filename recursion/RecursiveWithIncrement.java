package com.ava.recursion;

public class RecursiveWithIncrement {

	public static void main(String[] args) {
		int number = 5;
		int factorial = 1;
		
		for (int i = 1; i <= number; i++) {
			//System.out.println(i);
			factorial *= i;
		}
		System.out.print("The answer of 5! is: " + factorial);

	}

}
