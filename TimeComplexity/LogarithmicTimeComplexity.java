package com.ava.TimeComplexity;

public class LogarithmicTimeComplexity {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		int[] arr = {1, 2, 3, 4, 6, 7, 8, 9, 10, 11};
		int searchKey = 11;
		int stepsTaken = 0;
		
		
		Long endTime = System.nanoTime();
		System.out.println("Execution Time is: " + (endTime - startTime));
		
		binarySearchTimeComplexity(arr, searchKey, stepsTaken);
	}
	public static void binarySearchTimeComplexity(int[] list, int key, int stepsTaken) {
		int low = 0;
		int high = list.length - 1;
		
		while(high >= low) {
			int mid = (low + high) / 2;
			if(key < list[mid]) {
				high = mid - 1;
				stepsTaken++;
			}else if(key == list[mid]) {
				stepsTaken++;
				break;
				}
			else {
				stepsTaken++;
				low = mid + 1;
			}
		}
		System.out.println("Time complexity is: " + stepsTaken);
		
}
}