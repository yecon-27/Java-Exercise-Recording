package com.ava.recursion;

public class Multiplication {
//Ye Cong 1306248
	public static void main(String[] args) {
		System.out.print("The pi computation answer is: " + mul(2, 0.5));
	}
	public static double mul(double a, double x) {
		double mul = 1;
		double term;
		for(int i = 1; i <=20 ; i++) {
			term = a * Math.pow(x, i);
			mul *= term;
		}
		return mul;
	}
}
