package com.ava.dynamicprogramming;

public class BottomUpApproach {
	static int stepsTaken;
	static long startTime;
	static long endTime;

    public static void main(String[] args) {
        int n = 10000; // n = 20; n = 40; n = 50; n = 100; n = 1000
        long startTime = System.nanoTime();
        System.out.println("Fib(" + n + ") = " + fibBottomUp(n));
        long endTime = System.nanoTime();
        System.out.println("StepsTaken: " + stepsTaken);
        System.out.println("ExecTime: " + (endTime - startTime));
        
    }

    public static int fibBottomUp(int num) {
        if (num == 1 || num == 2) { // initial condition: f(0) = 0, f(1) = 1, f(2) = 1
            return 1;
        } else {
            int[] fib = new int[num + 1];
            fib[1] = 1;
            fib[2] = 1;
            for (int i = 3; i <= num; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
                // System.out.println("fib(" + i + ") = " + fib[i]);
                stepsTaken++;
            }
            return fib[num];
        }
    }

}
