package Chapter5;

public class TestBreak {

	public static void main(String[] args) {
		int sum = 0;
		int number = 0;
		
		while(number < 20) {
			number++;
			sum += number;
			/*with the if statement, the loop terminates when sum becomes 
			greater than or equal to 100.*/
			//break: use the keyword to immediatedly terminate the loop
			if(sum >= 100)
				break;
		}//Rewrite without using break:
		/*
		boolean continueLoop = true; // A flag to control the loop

		while (continueLoop) {
		    number++;
		    sum += number;
		    if (sum >= 100) {
		        continueLoop = false; // Set the flag to false to stop the loop
		    }
		}*/
		
		System.out.println("The number is " + number);
		System.out.println("The sum is " + sum);
	}

}
