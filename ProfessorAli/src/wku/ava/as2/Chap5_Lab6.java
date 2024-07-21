package wku.ava.as2;
import java.util.Scanner;
public class Chap5_Lab6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Prompt the user to enter 2 positive integers
		System.out.print("Enter first integer: ");
		int n1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int n2 = input.nextInt();
		
		int gcd = 1;
		int factor = 2;
		
		while(factor <= n1 && factor <= n2) {
			if (n1 % factor == 0 && n2 % factor== 0)
				gcd = factor;//Update GCD
			factor++;
		}
		/*for (int factor = 2; factor <= n1 && factor <= n2; k++) {
 		if (n1 % factor == 0 && n2 % factor == 0)
 		gcd = factor;
		}*/
		
		System.out.println("The greatest common divisor for " +
				n1 + " and " + n2 + " is " + gcd);
		input.close();
	}
}


