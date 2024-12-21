package com.ava.recursion;
//Ye Cong 1306248
public class FibonacciNumberRecursiveCalls {
	public static void main(String[] args) {
		int n = 11;
		System.out.println("Fib(" + n + ")=" + fib(n));
	}
	public static int fib(int num) {
		if (num == 0) {
			return 0;
		}
		if (num == 1) {
			return 1;
		}else {
			return fib(num-1) + fib(num-2);
		}
		
	}
}
