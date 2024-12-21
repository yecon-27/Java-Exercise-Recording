package com.ava.TimeComplexity;
//Time complexity:O(n^2)
//Check: Back --> Front
public class InsertionSort {
	public static long startTime;
	public static long endTime;
	public static void main(String[] args) {
		int[] list = {2, 3, 2, 6, 5, 1, -2, 3, 17, 12};
		insertionSort(list);
		System.out.print("Sorted list: ");
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}

	}
	public static void insertionSort(int[] list) {
		startTime = System.nanoTime();
		int sum = 0;
		for(int i = 1; i< list.length; i++) {
			int currentElement = list[i];//temporary variable
			int stepsTaken = 0;
			int k;
			for(k = i - 1; k >= 0 && list[k] > currentElement; k--) {
				list[k + 1] = list[k];
				stepsTaken++;
				sum += stepsTaken;
				System.out.println(list[k] + " in index " + k + ": " + stepsTaken +" operations");
			}
			list[k + 1] = currentElement;
			
		}
		endTime = System.nanoTime();
		System.out.println("The Run Time is:" + sum);
		System.out.println("Execution time is: " + (endTime - startTime));
		
	}
	
}
