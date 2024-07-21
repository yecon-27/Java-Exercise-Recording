package wku.ava.week8;
import java.util.Scanner;
public class SubtractionQuiz {
	public static void main(String[] args) {
		final int NUMBER_OF_QUESTIONS = 5;
		int correctCount = 0;
		int count = 0;
		//total milliseconds since midnight, Janurary 1, 1970
		long startTime = System.currentTimeMillis();
		String output = " ";
		Scanner input = new Scanner(System.in);
		
		while(count < NUMBER_OF_QUESTIONS) {
			int number1 = (int)(Math.random() * 10);
			int number2 = (int)(Math.random() * 10);
			//If number1 < number2, swap number1 with number2
			if(number1 < number2) {
				int temp = number1;
				number1 = number2;
				number2 = temp;
			}
		System.out.print("What is " + number1 + " - " + number2 + "? ");
		int answer = input.nextInt();
		
		//grade the answer and display the result
		if(number1 - number2 == answer) {
			System.out.println("You are correct!");
			correctCount++;
		}
		else
			System.out.println("Your answer is wrong.\n" +
		number1 + " - " + " should be " + (number1 - number2));
		//Increase the question count: control variable 
		count++;	
		//prepare output
		output +="\n" + number1 + "-" + number2 + "=" + answer +
				((number1 - number2 == answer )? " correct": " wrong");
		}//end loop
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;
		System.out.println("Correct count is " + correctCount + 
				"\nTest time is " + testTime / 1000 + " seconds\n" + output);
		input.close();	
	}
	
}
