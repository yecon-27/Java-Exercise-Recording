package com.ava.recursion;

public class FactorialIncrementMethodCall {
//Ye Cong 1306248
	public static void main(String[] args) {
		 int n = 5;
		 System.out.println("The factorial of " + n +"! is: " + Factorial(n));

	}
	 public static int Factorial(int number){
		 int factorial = 1;
		 
		 for (int i = number; i >=1 ; i--){
		 	factorial *= i;
		 }
		 return factorial;
		 }
}
