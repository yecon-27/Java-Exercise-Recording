package com.ava.dynamicprogramming;

public class FibonacciFFT {
	public static long startTime;
    public static long endTime;
    public static int stepsTaken;

    public static void main(String[] args) {
        int n = 10; // 计算第n个斐波那契数
        startTime = System.nanoTime();
        long fib = fibonacciFFT(n);
        endTime = System.nanoTime();
        
        System.out.println("Fibonacci number at position " + n + " is: " + fib);
        System.out.println("Execution time is: " + (endTime - startTime) + " nanoseconds");
        System.out.println("Run time is: " + stepsTaken + " steps");
    }

    public static long fibonacciFFT(int n) {
        stepsTaken = 0;
        if (n <= 1) {
            stepsTaken++;
            return n;
        }

        // Matrix representation of Fibonacci sequence
        long[][] F = {{1, 1}, {1, 0}};
        power(F, n - 1);

        return F[0][0];}

    public static void multiply(long[][] F, long[][] M) {
        long x = F[0][0] * M[0][0] + F[0][1] * M[1][0];
        long y = F[0][0] * M[0][1] + F[0][1] * M[1][1];
        long z = F[1][0] * M[0][0] + F[1][1] * M[1][0];
        long w = F[1][0] * M[0][1] + F[1][1] * M[1][1];

        F[0][0] = x;
        F[0][1] = y;
        F[1][0] = z;
        F[1][1] = w;

        stepsTaken += 4;
    }

    public static void power(long[][] F, int n) {
        if (n == 0 || n == 1) {
            stepsTaken++;
            return;
        }
        long[][] M = {{1, 1}, {1, 0}};

        power(F, n / 2);
        multiply(F, F);

        if (n % 2 != 0) {
            multiply(F, M);
        }
    }
}
