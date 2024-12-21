package com.ava.TimeComplexity;

public class SelectonSort {
	public static long startTime;
	public static long endTime;
	public static int stepsTaken;
	public static void main(String[] args) {
//		double[] array1 ={2, 3, 2, 6, 5, 1, -2, 3, 17, 12};
//		double[] array2 ={2, 3, 2, 6, 5, 1, -2, 3, 17, 12, 2, 3, 2, 6, 5};
		double[] array3 ={2, 3, 2, 6, 5, 1, -2, 3, 17, 12,2, 3, 2, 6, 5, 1, -2, 3, 17, 12};
//		selectionSort(array1);
//		selectionSort(array2);
		selectionSort(array3);

	}
	public static void selectionSort(double[] array) {
		startTime = System.nanoTime();
		for(int i = 0; i < array.length; i++) {
			double currentMin = array[i];
			int currentMinIndex = i;
			System.out.println("Curr min: " + currentMin);
		
		for(int j = i + 1; j < array.length; j++) {
			if(currentMin > array[j]) {
				//swap
				array[currentMinIndex] = array[j];
				array[j] = currentMin;
				currentMin = array[currentMinIndex];
				System.out.println("New current min: " + currentMin);
				stepsTaken++;
			}
			if(currentMin != i) {
				array[currentMinIndex] = array[i];
				array[i] = currentMin;
			}
		}
		}
		System.out.print("Sorted list: ") ;
		for(double element: array)
			System.out.print(element +", ");
		System.out.println();
		endTime = System.nanoTime();
		System.out.println("Execution Time is:" + (endTime - startTime));
		System.out.println("Run time is " + stepsTaken);
		
	}
}
