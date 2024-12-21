package com.ava.recursion;

public class FactorialRecursion {
//Ye Cong 1306248
	public static void main(String[] args) {
		int n = 4;
		System.out.print(Factorial(n));

	}
	public static int Factorial(int number) {
		if(number == 0)
			return 1;
		else		
			return number * Factorial(number-1);
	}
}
