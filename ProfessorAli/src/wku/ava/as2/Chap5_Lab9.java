package wku.ava.as2;
import java.util.Scanner;
public class Chap5_Lab9 {

	public static void main(String[] args) {
		System.out.println("Please enter a number: ");
		Scanner input = new Scanner(System.in);
		//Prompt the user to enter a integer
		
		int number = input.nextInt();
		//Prerequisite: The number should be greater than 2
		if (number < 2){
			System.out.print("Numbers less than 2 are not prime numbers. Please enter again.");
			number = input.nextInt();
		}
		//Find all the prime factors
		System.out.print("All prime factors of the number are: ");
		for (int i = 2; i <= number; i++) {
			while (number % i == 0) {//factors
				for(int j = 2; j <= Math.sqrt(i); j++) {
					if(i % j == 0)
						break;//not prime number
					else
						System.out.print(i + " ");
				}	
				number = number / i;//control variable

			}	
		}
		input.close();
	}

}
