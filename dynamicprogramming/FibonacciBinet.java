package com.ava.dynamicprogramming;

public class FibonacciBinet {
	public static long startTime;
    public static long endTime;
    public static int stepsTaken;

    public static void main(String[] args) {
        int n = 10; // 计算第n个斐波那契数
        startTime = System.nanoTime();
        double fib = fibonacciBinet(n);
        endTime = System.nanoTime();
        
        System.out.println("Fibonacci number at position " + n + " is: " + (int)fib);
        System.out.println("Execution time is: " + (endTime - startTime) + " nanoseconds");
        System.out.println("Run time is: " + stepsTaken + " steps");
    }

    public static double fibonacciBinet(int n) {
        stepsTaken = 0;
        double sqrt5 = Math.sqrt(5);
        stepsTaken++;
        double phi = (1 + sqrt5) / 2;
        stepsTaken++;
        double psi = (1 - sqrt5) / 2;
        stepsTaken++;
        double fib = (Math.pow(phi, n) - Math.pow(psi, n)) / sqrt5;
        stepsTaken++;
        return fib;
    }
}
