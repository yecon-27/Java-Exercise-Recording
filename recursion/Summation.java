package com.ava.recursion;

public class Summation {
//Ye Cong 1306248
	public static void main(String[] args) {
		System.out.print("The sigma computation answer is: " + sum(2, 0.5));

	}
	public static double sum(double a, double x) {
		double sum = 0;
		double term = 0;
		for(int i = 1; i <=50 ; i++) {
			term = a * Math.pow(x, i);
			sum += term;
		}
		return sum;
	}
}
