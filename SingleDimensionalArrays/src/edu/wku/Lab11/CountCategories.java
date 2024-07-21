package edu.wku.Lab11;
import java.util.Scanner;

public class CountCategories {

	public static void countCategories() {
		/*1.Read 10 integers --> create an array to store each integer*/
		System.out.println("Enter 10 integers = ");
		Scanner input = new Scanner(System.in);
		String inputLine = input.nextLine();
		input.close();
		String deleteSpaces = inputLine.replace(" ", "");
		String deleteMinus = deleteSpaces.replace("-","");
		String[] parts = inputLine.split(" ");
		char[] inputValue = deleteMinus.toCharArray();
		int[] intArray = new int[10];
		boolean isValid = true;
		
		for(int i = 0; i < inputValue.length; i++) {
			if(!Character.isDigit(inputValue[i])){
				System.out.println("Invalid input; please enter only integers");
				isValid = false;
			
		}
		}
		
		if(parts.length != 10) {
			System.out.println("Invalid input; please enter only 10 integers");
			isValid = false;
			}
		
		
		if(isValid) {

			for(int i = 0; i < parts.length; i++) {
				for (int j = 0; j < parts[i].length(); j++) {
					if(parts[i].charAt(j)=='-') {
					continue;
					}
					
				    intArray[i] = Integer.parseInt(parts[i]);
				    
					}
				}
			
			
			int countOfEvenNumbers = 0;
			int countOfOddNumbers = 0;
			int countOfPositiveNumbers = 0;
			int countOfNegativeNumbers = 0;
			for(int e : intArray) {
				if (e % 2 == 0) {
					countOfEvenNumbers++;
				}else{
					countOfOddNumbers++;
				}
				if(e > 0){
					countOfPositiveNumbers++;
				}else if(e < 0) {
					countOfNegativeNumbers++;
			}
			}
			System.out.println("Even Numbers = " + countOfEvenNumbers);
			System.out.println("Odd Numbers = " + countOfOddNumbers);
			System.out.println("Positive Numbers = " + countOfPositiveNumbers);
			System.out.println("Negative Numbers = " + countOfNegativeNumbers);
			
		
}
}
}
