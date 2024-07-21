package week12;
//Ye Cong 1306248
import java.util.Scanner;
public class Quotient {
//Arithmetic: Math
//ALU: Arithmetic and Logic Unit
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 2 integers: ");
		//Test the divisor is 0;
		//Dividing 7 by 0 caused the program to terminate
		//A floating-point number divided by 0 does not raise an exception
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		System.out.println(n1 + " / " + n2 + " is " + (n1 / n2));
		input.close();

	}

}
