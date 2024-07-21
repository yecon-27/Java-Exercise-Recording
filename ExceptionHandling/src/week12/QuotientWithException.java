package week12;
//Ye Cong 1306248
//The biggest difference: the program does not terminate
import java.util.Scanner;
public class QuotientWithException {
	//Define a method
	public static int quotient(int n1, int n2) {
		if ( n2 == 0) 
	//Method throws the exception error
			throw new ArithmeticException("Divisor cannot be zero.");
		return n1 / n2;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	//Read Input
		System.out.println("Please enter 2 integers");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		input.close();
	//Use the try-catch syntax to choose whether it has an runtime error
		try {
			int result = quotient(n1, n2);
			System.out.println(n1 + " / " + n2 + " is " + result);
		}//compile error if there is any statement:checked error
		catch (ArithmeticException ex) {
			System.out.println("Exception: an integer" + " cannot be divided by zero ");
		}
		System.out.println("Execution continues ...");//Program is not terminated, the program can continue
		
	}
	
}
