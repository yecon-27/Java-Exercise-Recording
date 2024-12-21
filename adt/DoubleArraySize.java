package com.ava.adt;
import java.util.Scanner;
public class DoubleArraySize {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] myList = new int[2];
		System.out.println("Last index: " + (myList.length - 1));
		System.out.println("Enter " + myList.length + " Values: ");//5,5,4,4,4,4,3,3,3,3,3,3,-1
		System.out.println("Array is: ");
		
		for (int i = 0; i < myList.length; i++) {
			myList[i] = input.nextInt();
			if (myList[i] == -1) {
			System.out.println("End of input!");
			System.exit(0);
		}
			
		for (int e: myList) {
			System.out.print(e + " ");
		}
		if (myList.length-1 == i) {
			int[] newList = new int[myList.length*2];
			System.out.println();
			System.out.println("New Array last index:" + (newList.length - 1));
			System.out.println("Enter " + newList.length + " Values: ");
		
			for (int j = 0; j < myList.length; j++) {
				newList[j] = myList[j];
			}
			myList = newList;
		}//end if
		}
		input.close();  
	}

}
