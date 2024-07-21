package edu.wku.lab10;

import java.util.Scanner;

public class PalindromeInteger {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		int num = input.nextInt();
		input.close();
		
		if(isPalindrome(num))
			System.out.println("This integer is a Palindrome number.");
		else
			System.out.println("This integer is not a Palindrome number.");
	}
	public static boolean isPalindrome(int num) {
		String numIntoString = num + "";
		int length = numIntoString.length();
		int low = 0;
		int high = length - 1;
		while(low < high) {
			if(numIntoString.charAt(low) != numIntoString.charAt(high)) {
				return false;
			}
			low++;
			high--;
		}
	//According to identity value, print the result
		return true;
	}
}
