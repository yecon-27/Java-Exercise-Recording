package week12;
import java.util.Scanner;
public class QuotientWithIf {
//Ye Cong 1306248
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 2 integers");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		if(n2 != 0) {
			System.out.println(n1 + " / " + n2 + " is " + (n1 / n2));
		}
		else
			System.out.println("Divisor cannot be zero.");
		input.close();
	}

}
