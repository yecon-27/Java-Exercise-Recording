package wku.ava.week10;
import java.util.Scanner;
public class SentinelValue {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int num = input.nextInt();
		int sum = 0;
		
		while(num != 0) {
			sum = sum + num;
			System.out.println("Please enter the next number: ");
			num = input.nextInt();
			}
		input.close();
		System.out.println("The sum is " + sum);

	}

}
