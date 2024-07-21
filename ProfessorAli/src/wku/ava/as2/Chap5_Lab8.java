package wku.ava.as2;
import java.util.Scanner;
public class Chap5_Lab8 {

	public static void main(String[] args) {
		System.out.print("Enter the row you want to specify for the Palindrome Number Triangle: ");
		Scanner input = new Scanner(System.in);
		int rows = input.nextInt();
		//Divide the Palindrome Number Triangle into 3 Part
		//It is in different order
		
		for (int i = 1; i <= rows; i++) {//The common control variable: specify the initial value to be 1 to avoid ambiguity
			//Part1: The Reversed Right Half Pyramid of " "
			
			for(int j = 1; j <= rows - i; j++) {
				System.out.print("  ");//Double spaces since you use one space between each number
			}
			//Part2: The Left Half Pyramid of numbers(Align Right):start from the current line row to 1
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}//Part3: The Right Half Pyramid of numbers(start from 2 to the current line row)
			
			for(int j = 2; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		input.close();
}
}
