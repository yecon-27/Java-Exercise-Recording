package wku.ava.as2;
import java.util.Scanner;
public class Chap5_Lab7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter 2 integers to decide the scope
		System.out.print("Enter the Start integer: ");
		int n1 = input.nextInt();
		System.out.print("Enter the End integer: ");
		int n2 = input.nextInt();
		
		//Use a nested loop to find all prime numbers with the range
		System.out.println("The prime numebr between " + n1 + " and " + n2 + " is: ");
		
		for (int i = n1 ; i <= n2; i++) {//The range scope: as a control variable, i represents each number between the range
			boolean isPrime = true;//Assume the number is a prime number at first--Readability
			for(int k = 2; k <= Math.sqrt(i); k++) {//Check factor up to the square root of i(each number within the range scope)
				if (i % k == 0) {
					isPrime = false;
					break;
				}
			}//end of the loop
		if(isPrime) {
				System.out.print(i + " ");	
		}
		input.close();
	}
	}
}
