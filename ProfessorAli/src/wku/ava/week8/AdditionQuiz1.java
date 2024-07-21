package wku.ava.week8;
import java.util.Scanner;
public class AdditionQuiz1 {

	public static void main(String[] args) {
		int a = (int)(Math.random() * 10);
		int b = (int)(Math.random() * 10);
		//Prompt the user to enter the sum
		System.out.println(
				"What is " + a + " + " + b + " ? ");
		System.out.print("Enter the number: ");
		Scanner input = new Scanner(System.in);
		int sum = input.nextInt();
		
		while(true) {
			if(sum == a + b) {
				System.out.print("The summation is correct");
				break;//Exit the loop if the guess is correct
			}else if(sum > a + b) {
				System.out.println("Too high! Try again!");
			}else {
				System.out.println("Too low! Try again!");
			}
			System.out.print("Enter the number again: ");
			sum = input.nextInt();
		}
		input.close();
		}
	}


