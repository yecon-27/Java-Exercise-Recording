package com.ava.TimeComplexity;

public class LinearTimeComplexity {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		int stepsTaken = 0;
		
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		int sumFirstTwentyNum = 0;
		for(int i = 0; i < array.length; i++) {
			sumFirstTwentyNum = sumFirstTwentyNum + array[i];
			stepsTaken = stepsTaken + 1;
		}
		System.out.println("Sum of first " + array.length + " numbers: " + sumFirstTwentyNum);
		System.out.println("Time complexity: " + stepsTaken);
		
		long endTime = System.nanoTime();
		//We have n/p problem for execution time, it differs from P.C.
		System.out.println("Execution Time is: " + (endTime - startTime));
		}

}
