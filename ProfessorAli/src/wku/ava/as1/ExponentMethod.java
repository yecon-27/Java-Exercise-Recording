package wku.ava.as1;
//Ye Cong 1306248
import java.util.Scanner;
public class ExponentMethod {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Prompt the user to enter a number
		System.out.print("Enter a number: ");
		double a = input.nextDouble();
		//Execute the ExponentMethod
		System.out.println("e raised to power of the number is: " + Math.exp(a));
		if (a > 0) {
			System.out.println("The natural logarithm of the number is: " + Math.log(a));
			System.out.println("The base 10 logarithm of the number is: " + Math.log10(a));}
		else {
			System.out.println("The natural logarithm of the number is invalid");
			System.out.println("The base 10 logarithm of the number is invalid");
		}
		System.out.println("2 raised to the power of the number is: " + Math.pow(2, a));
		if(a > 0 || a == 0)
			System.out.println("The square root of the number is: " + Math.sqrt(a));
		else
			System.out.println("The square root of the number is invalid");
		//To avoid source leaking
		input.close();
	}
}
