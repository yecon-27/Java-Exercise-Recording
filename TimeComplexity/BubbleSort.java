package com.ava.TimeComplexity;

public class BubbleSort {
	public static long startTime;
	public static long endTime;
	public static int stepsTaken;
	
	public static void main(String[] args) {
//		int[] array1 ={2, 3, 2, 6, 5, 1, -2, 3, 17, 12};
//		int[] array2 ={2, 3, 2, 6, 5, 1, -2, 3, 17, 12, 2, 3, 2, 6, 5};
		int[] array3 ={2, 3, 2, 6, 5, 1, -2, 3, 17, 12, 2, 3, 2, 6, 5, 1, -2, 3, 17, 12};
//		bubbleSort(array1);
//		bubbleSort(array2);
		bubbleSort(array3);
//		
	}
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		int temp;
		startTime = System.nanoTime();
		int stepsTaken = 0;
		for(int i = 0; i < n - 1; i++) {
			 boolean swapped = false;
			for(int j = 1; j < n - i; j++) {
				if(arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
					stepsTaken = stepsTaken + 1;
					System.out.println("Steps: " + stepsTaken);
					swapped = true;
				}
			}
			System.out.print("Pass " + (i + 1) + ": ");
			printArray(arr);
            if (!swapped) break;
	}
		endTime = System.nanoTime();
		System.out.println("Execution Time is:" + (endTime - startTime));
		System.out.println("Run time is " + stepsTaken);
	}	
	public static void printArray(int[] arr) {
		System.out.print("Sorted list: ") ;
		for(double element: arr)
			System.out.print(element +", ");
		System.out.println();
	}
	
}
