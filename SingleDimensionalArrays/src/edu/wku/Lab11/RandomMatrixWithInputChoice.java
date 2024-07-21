package edu.wku.Lab11;
import java.util.Scanner;
public class RandomMatrixWithInputChoice {

	public static void main(String[] args) {
		/*1.declare 10 integers array*/
		int[] array = new int[10];
		/*2.invoke random function inputs: 40 - 85 --> 40 + 0 - 45*/
		int i = 0;
		while (i < array.length) {
			array[i] = (int)(Math.random()* 45 + 40);
			i++;
		}
		System.out.println("The matrix initialized with random value(40 - 85) is:");
		for (int e : array) {
			System.out.print(e + " ");
		}
		System.out.println();
		/*3.prompt the user to input the choice:*/
		System.out.println("You can pick one choice to do something on the matrix ");
		System.out.println("(Enter 1 to find a maximum number from the array");
		System.out.println("Enter 2 to find a specific number using linear search");
		System.out.println("Enter 3 to sort the array"); 
		System.out.println("Enter 4 to user defined number using binary search.): ");
				
		Scanner input = new Scanner(System.in);
		//If user enter invalid value, show user“Invalid input, please try again”and promote user input a valid number.
		while(true) {
		int choice = input.nextInt();
		if (choice >= 1 && choice <=4) {
			inputChoiceExecution(choice, array);
			break;
		}else{
			System.out.println("Invalid input, please try again");
			choice = input.nextInt();
		}
		}
		input.close();
		}
	
	public static void inputChoiceExecution(int choice, int array[]) {
		switch (choice) {
		//Enter 1 to find a maximum number from the array.
		case 1:
			int max = array[0];
			for(int i = 1; i < array.length; i++) {
				if (max < array[i]) {
					max = array[i];
				}
			}
			System.out.println("The maximum number of the matrix is " + max);
			break;
			
		//Enter 2 to find a specific number using linear search.
		case 2:
			System.out.print("Enter the number you want to search in matrix: ");
			Scanner input = new Scanner(System.in);
			int key = input.nextInt();
			int indexOfKey = -1;
			boolean isFound = false;
			for (int i = 0; i < array.length; i++) {
				if (array[i] == key) {
					indexOfKey = i;
					isFound = true;
					break;
				}
				
			}
			if(isFound)
				System.out.println("The specific number is at the " + indexOfKey + " index position.(Default Sets: only show the first occurrence)");
			else
				System.out.println("Your input number is not in the matrix.");
			break;
			
		//Enter 3 to sort the array.
		case 3:
			/*Using currentMin to repeat the comparing process*/
			sortingMatrix(array);
			System.out.println("After sorting in ascending order, The matrix becomes: ");
			for(int e : array)
				System.out.print(e + " ");
			break;
			
		//Enter 4 to user defined number using binary search./
		case 4:
			System.out.print("Enter the number you want to search in matrix: ");
			Scanner sc = new Scanner(System.in);
			int key1 = sc.nextInt();
			int[] sortedArray = sortingMatrix(array);
			int indexOfKey1 = -1;
			int low = 0;
			int high = sortedArray.length - 1;
			int mid = (low + high) / 2;
			boolean isFound1 = false;
			
			for (int i = low; i <= high; i++) {
			//The search would miss a possible matching element. Consider a list with just one element. The search would miss the element.
				if (key1 < sortedArray[mid] ) {
					high = mid - 1;
				}
				else if (key1 == sortedArray[mid]){
					indexOfKey1 = mid;
					isFound1 = true;
					break;
					}
				else {
					low = mid + 1;
				}
				mid = (low + high) / 2;
			}
			
			if(isFound1) {
				System.out.println("The specific number is at the " + indexOfKey1 + " index position.(Default sets: the system rearrange the given array is ascending order and only show the first occurrence of searched value)");
			}else {
				System.out.println("Your input number is not in the matrix.");
			}
			break;
			//If i only put isFound1 here, whether 
		
		}
	}//end of method
	public static int[] sortingMatrix(int array[]) {
			for (int i = 0; i < array.length - 1; i++) {
				int currentMin = array[i];
				int indexOfCurrentMin = i;
				/*Using nested for loop to compare the one before and one after*/
				for (int j = i + 1; j < array.length; j++) {
					if (currentMin > array[j]) {
						currentMin = array[j];
						indexOfCurrentMin = j;
					}
				}
				/*Swap*/
				if (indexOfCurrentMin != i) {
					int temp = array[indexOfCurrentMin];
					array[indexOfCurrentMin] = array[i];
					array[i] = temp;
				}
			}
			return array;
			
		
	}//end of method
}
