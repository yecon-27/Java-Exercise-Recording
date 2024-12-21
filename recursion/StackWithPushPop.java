package com.ava.recursion;
import java.util.Scanner;
public class StackWithPushPop {
//Stacktrace
	public static void main(String[] args) {
		recursiveStack();
	}
	public static void recursiveStack() {
		Scanner input = new Scanner(System.in);
		String number = input.nextLine();
		if (number.equals("*")) {
			System.out.println("End Command-Line-Interface Input");
		}
		else {
			recursiveStack();
		}
		System.out.println(number);
		input.close();
	}
}
//Scanner input = new Scanner(System.in);
//System.out.println("Please push the collection you want to add");
//	for(int i = 1; i <= 4; i++) {
//		String data = input.next();
//	}
//
//
//input.close();