package com.ava.recursion;
import java.util.Scanner;
public class RecursiveStackInt {
//Ye Cong 1306248
	public static void main(String[] args) {
		recursiveStack();

	}
	public static void recursiveStack() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number for the factorial: ");
		int number = input.nextInt();
		if (number == 5) {
			System.out.println("End Command-Line-Interface Input");
		}
		else {
			recursiveStack();
		}
		System.out.println(number);
		input.close();
	}
	
}
