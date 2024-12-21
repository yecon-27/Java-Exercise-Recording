package com.ava.TimeComplexity;

public class ConstantTimeComplexityTest {

	public static void main(String[] args) {
		Long startTime = System.nanoTime();
		int stepsTaken = 0;
		int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		System.out.println("Length is: " + x.length);
		 System.out.println("Sum of first " + x.length + " numbers is: " + x.length*(x.length + 1)/2);
		 Long endTime = System.nanoTime();
		 System.out.println("Execution Time is: " + (endTime - startTime));
		 stepsTaken += 1;
		 System.out.println("Time complexity is: " + stepsTaken);

	}

}
