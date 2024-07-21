package Chapter5;

public class TestContinue {

	public static void main(String[] args) {
		int sum = 0;
		int number = 0;
		
		while(number < 20) {
			number++;
			if(number == 10 || number == 11)
				//use continue to end the current iteration and programs controls goes to the end of the loop body
				//number is not added to sum when it is 10 or 11
				continue;
			sum += number;
		}
		//Rewrite it without using continue keyword:
		/*while (number < 20) {
		    number++;
		    if (number != 10 && number != 11) {
		        sum += number;
		    }
		}*/

		System.out.println("The sum is " + sum);
	}

}
