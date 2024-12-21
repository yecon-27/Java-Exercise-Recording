package com.ava.recursion;

public class RecursiveWithWhile {
//Ye Cong 1306248
	public static void main(String[] args) {
		int number = 5;
		int factorial = 1;
		int i = number;
		while (i >= 1) {
			//System.out.println(i);
			factorial *= i;
			i--;
		}
		System.out.print("The answer of 5! is: " + factorial);
	}

}
