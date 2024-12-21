package com.ava.dynamicprogramming;

public class FibonacciNumberRecursiveCalls {
	static long stepsTaken = 0;

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int n = 50; //n = 11, n = 20; n = 40;
        System.out.println("Fib(" + n + ") = " + fib(n));
        long endTime = System.nanoTime();
        System.out.println("ExecTime: " + (endTime - startTime));
        System.out.println("StepsTaken " + stepsTaken);
    }

    public static int fib(int num) {
        stepsTaken = stepsTaken + 1;
        if (num == 0)
            return 0; // initial condition f(0) = 0
        if (num == 1 || num == 2)
            return 1; // initial condition f(1) = 1; and f(0) = 1
        else {
            return fib(num - 1) + fib(num - 2);
        }
    }

}
