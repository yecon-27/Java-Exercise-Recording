package com.ava.TimeComplexity;

public class GCD1 {
	static long startTime;
	static long endTime;
	public static void main(String[] args) {
		int m = 270;
		int n = 192;
		System.out.println("GCD is: " + gcd(m ,n));

	}
	public static int gcd(int m , int n) {
		int gcd = 1;
		int stepsTaken = 0;
		startTime = System.nanoTime();
		for (int k = 2; k <= m && k <= n; k++) {
			System.out.println("Linear Time step: " + (stepsTaken = stepsTaken + 1));
			if (m % k == 0 && n % k == 0) {
				gcd = k;
				endTime = System.nanoTime();
			}
			System.out.println("Execution Time is " + (endTime - startTime));
		}
		return gcd;
	}
}
