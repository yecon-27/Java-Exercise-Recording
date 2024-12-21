package com.ava.TimeComplexity;
//O(n)= logarithmic n
public class GreatestCommonDivisor {
	static long startTime;
	static long endTime;
	static int stepsTaken = 0;
	
	public static void main(String[] args) {
		int x = 270;
		int y = 192;
		System.out.println("GCD is:" + gcd(x, y));
		endTime = System.nanoTime();
		System.out.println("Execution Time: " + (endTime - startTime));

	}
	public static int gcd(int m , int n) {
		startTime = System.nanoTime();
		if(m % n == 0) {
			System.out.println("Linear Time Step1: " + (++stepsTaken));
			return n;
		}else {
			System.out.println("Linear Time Step2: " + (++stepsTaken));
			return gcd(n , m%n);
		}
	}

}
