package wku.ava.week12;
import java.util.Scanner;
public class GreatestCommonDivisor {

	public static void main(String[] args) {
		//1.Read Input
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the first integer: " );
		int n1 = input.nextInt();
		System.out.println("Please enter the second integer: " );
		int n2 = input.nextInt();
		//2.Invoke the gcd method to calculate
		System.out.println("The Greates Common Divisor is: " + gcd(n1, n2));
		input.close();
	}

//3.Define a method(value-returnning)
public static int gcd(int n1, int n2) {
//Declare the variable gcd and divisor
	int gcd = 1;
	int k = 2;
	while(k <= n1 && k <= n2 ) {
		if (n1 % k == 0 && n2 % k == 0)
			gcd = k;//Update GCD
		k++;
		}
	return gcd;
}
}
