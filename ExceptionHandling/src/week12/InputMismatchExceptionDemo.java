package week12;
//Object--Exception--MismatchException
//Object--Scanner
import java.util.*;
public class InputMismatchExceptionDemo {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		boolean continueInput = true;
		//do first before the loop
		do {
			try {
		//Read the input
		System.out.println("Enter an integers");
		int n = input.nextInt();
		input.close();
		System.out.println("The number entered is " + n);
		
		continueInput = false;
		}
		catch (InputMismatchException ex) {
			System.out.println("Try again. (" + 
			"Incorrect input: an integer is required.");
			input.nextLine();
			}
		}while (continueInput);//continue input == true
	}
}
