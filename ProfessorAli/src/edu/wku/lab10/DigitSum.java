package edu.wku.lab10;
import java.util.Scanner;
public class DigitSum {

	public static void main(String[] args) {
		//1.Read Input
		System.out.println("Please enter an integer of any length: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.close();
		//3.Print
		System.out.println("The sum of the digits is " + digitSum(num));
		//Pass by reference, dont pass by value, only use sum will cause only printing 0 
		//Put the print statement in the void method is also fine
	}
	//2.Obtain each digit using a while statement(didn't know the iteration times exactly)
	public static int digitSum(int num){
		int sum = 0;
		int temp = 0;
		while (num != 0) {
			//Inside the Loop: assign each digit into a temporary variable, then add it to the sum
			temp = num % 10;//A temporary variable to store each digit
			num = num / 10;
			sum += temp;
			//temp = 0;
		}
		return sum;
	}
}