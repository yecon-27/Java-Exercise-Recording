package com.ava.recursion;

public class FactorialDecrementLoop {
//Ye Cong 1306248--Procedurial Programming Version
	public static void main(String[] args) {
		int number = 5;
		int factorial = 1;
		
		for (int i = number; i >= 1; i--) {
			//System.out.println(i);
			factorial *= i;
		}
		System.out.print("The answer of 5! is: " + factorial);
	}

}
