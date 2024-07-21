package Chapter5;
import java.util.Scanner;
public class SentinelValue {
//Here the sentinel value is 0
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(
				"Enter an integer (the input ends if it is 0): ");
		int data = input.nextInt();
		
		//Keep reading data until the input is 0
		//If data is 0, the loop body is no longer executed and the while loop terminates.
		int sum = 0;
		while(data != 0) {
			sum += data;
			
			//Read the next data
			System.out.print(
					"Enter an integer (the input ends if it is 0): ");
			data = input.nextInt();
		}
		System.out.println("The sum is " + sum);
		input.close();
		 
	}

}
