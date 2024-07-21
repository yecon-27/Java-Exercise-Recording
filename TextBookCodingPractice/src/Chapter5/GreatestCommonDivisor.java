package Chapter5;
import java.util.Scanner;
public class GreatestCommonDivisor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter 2 integers
		System.out.print("Enter first integer: ");
		int n1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int n2 = input.nextInt();
		
		int gcd = 1;
		int k = 2;
		//Think before you type: k is the sentinel input
		while(k <= n1 && k <= n2) {
			if (n1 % k == 0 && n2 % k == 0)
				gcd = k;//Update GCD
			k++;
		}
		/*
		for (int k = 2; k <= n1 && k <= n2; k++) {
 		if (n1 % k == 0 && n2 % k == 0)
 		gcd = k;}
		*/
		System.out.println("The greatest common divisor for " +
				n1 + " and " + n2 + " is " + gcd);
		input.close();
	}
}
