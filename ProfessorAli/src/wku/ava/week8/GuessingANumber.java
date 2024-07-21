package wku.ava.week8;
import java.util.Scanner;
public class GuessingANumber {

	public static void main(String[] args) {
		//Generate a random value between 0 and 100,inclusively
		int randomNumber = (int)(Math.random() * 101);
		//Prompt the user to enter a guessing number
		System.out.println("Enter the guessing number between 0 and 100 : ");
		Scanner input = new Scanner(System.in);
		
		//Using while loops to run the program until finding the correct number
/*while (true) { 
 // Prompt the user to guess the number
 System.out.print("\nEnter your guess: ");
 guess = input.nextInt();
 if (guess == number)
 System.out.println("Yes, the number is " + number);
 else if (guess > number)
 System.out.println("Your guess is too high");
 else 
 System.out.println("Your guess is too low"); 
} // End of loop*/
		while(true) {
				int userGuess = input.nextInt();
				if(userGuess == randomNumber) {
					System.out.println("Congratulations! The correct answer is indeed " + userGuess);
					break;//Exit the loop if the guess is correct
				}else if (userGuess < randomNumber) {
					System.out.println("Too low. Try again.");
				}else {
					System.out.println("Too high. Try again.");
				}
				System.out.println("Enter your next guess: ");
			}
		input.close();
		}

	}

