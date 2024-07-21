package edu.wku.Lab11;
import java.util.Scanner;
import java.util.ArrayList;
public class CountOccurrence {
	
	public static void countOccurrence() {
		/*1. Read the integer from keyboard:*/
		System.out.println("Enter the integers between 1 and 50: ");
		Scanner input = new Scanner(System.in);
		/*2. Use ArrayList to store each one --> use different memory location to store each entered number*/
		ArrayList<Integer> integerList = new ArrayList<>();
		while (true) {
			String inputLine = input.next();
			if ("0".equals(inputLine)) 
            	break;
			int number = Integer.parseInt(inputLine); 
            if(number < 1 || number > 50) {
				System.out.println("Invalid number! Program will exit.");
				System.exit(0);
            }
            else {
            	integerList.add(number);
            }
		}
		input.close();
		/*3. Unboxing-boxing*/
		Integer[] integerArray = integerList.toArray(new Integer[0]);//new Integer[0] is passed as the argument. 
		//Since it's an empty array, the toArray() method will create a new array with the same runtime type as integerList and fill it with the elements of the list. 
		//Finally, this array is assigned to the integerArray variable.
		int[] intArray = new int[integerArray.length];
		for(int i = 0; i < integerArray.length; i++) {
			intArray[i] = integerArray[i];
		}
		
		/*4. Sorting the array: According to the required output*/
		/*Using currentMin to repeat the comparing process*/
		for (int i = 0; i < intArray.length - 1; i++) {
			int currentMin = intArray[i];
			int indexOfCurrentMin = i;
			/*Using nested for loop to compare the one before and one after*/
			for (int j = i + 1; j < intArray.length; j++) {
				if (currentMin > intArray[j]) {
					currentMin = intArray[j];
					indexOfCurrentMin = j;
				}
			}
			/*Swap*/
			if(indexOfCurrentMin != i) {
				int temp = intArray[indexOfCurrentMin];
				intArray[indexOfCurrentMin] = intArray[i];
				intArray[i] = temp;
			}
		}
		/*5. If statement to output the times of occurrence*/
		int previousNumber = -1; // store the digit to avoid repeating, initialize it with -1, it means Not Found
        int count = 0; 

        
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] != previousNumber) {
                if (previousNumber != -1) {
                	System.out.println(previousNumber + " occurs " + count + (count > 1 ? " times" : " time"));
                }
                previousNumber = intArray[i];
                count = 1; 
            } else {
                count++; 
            }
        }
        //if the last number is the same as the second-to-last number, 
        //it won't be printed within the loop because the loop exits without entering the if block where printing occurs. 
        //Hence, to ensure that the count of the last number is printed in this scenario, the final if (previousNumber != -1) statement is necessary.
        if (previousNumber != -1) {
        	System.out.println(previousNumber + " occurs " + count + (count > 1 ? " times" : " time"));
        }
	
	}
	}
