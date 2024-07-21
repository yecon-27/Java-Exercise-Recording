package wku.ava.as2;
import java.util.Scanner;
public class Chap5_Lab3 {
	public static void main(String[] args) {
		
		System.out.print("Please enter a positive integer: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		//initialize a sentinel value to control the condition in judging whether it is a prime number
		boolean isPrime = true;
		//A prime number is only divisible by 1 and itself. 
		//The program should iterate from one less than this number till 2 
		//and check on each iteration whether any number could exactly divide this number or not. 
		if (number < 2) {
			System.out.println("It is not a prime number. A prime number cannot be less than 2.");
		}
		for (int divisor = 2; divisor <= Math.sqrt(number) ; divisor++) {//Check factor up to the square root of i(each number within the range scope)
			if(number % divisor == 0) {
			isPrime = false;//The number can be divided by other divisors
			break;//Exit the for loop, no need to traverse the other divisors anymore
			}
		}
		
		if (isPrime) {
			System.out.println(number + " is a prime number.");
		}else
			System.out.println(number + " is not a prime number.");	
		input.close();
	}
	
}
