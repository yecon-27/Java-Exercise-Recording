package wku.ava.week10;
import java.util.Scanner;
public class NestedLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char choice;
		do {
			System.out.println("Please enter the number:");
			int number = input.nextInt();
			//initialize the number
			int factorial = 1;
			while(number > 0) {
				factorial *= number;
				number--;
			}
			System.out.println("The Factorial = " +factorial);
			System.out.println("Do you want to continue? (Y/ N)");
			choice = input.next().charAt(0);
		}while(choice == 'y' || choice == 'Y');
			input.close();
	}

}
