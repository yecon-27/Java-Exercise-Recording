package week12;
//Ye Cong 1306248
import java.util.Scanner;

public class QuotientWithMethod {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 2 integers");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		
		int result = quotient(n1, n2);
		
		System.out.println(n1 + " / " + n2 + " is " + result);
		input.close();
		}

public static int quotient(int n1, int n2) {
	//To avoid the error in the most simple way, you cannot use the condition(!=), 
	if(n2 == 0) {
		System.out.println("The Divisor cannot be zero");
		System.exit(0);}//used to exit the program
	return n1 / n2;
}
}