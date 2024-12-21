package com.ava.adt;

public class LeftShiftFormula {

	public static void main(String[] args) {
		int m = 5;
		int n = 3;
		System.out.println("5 << 3 is " + bitwiseLeftShift(m,n));
		int hashcode = (int)(m << n);
		System.out.println("5 << 3 is " + hashcode);

	}
	public static int bitwiseLeftShift(int m, double n) {
		return (int) (m * Math.pow(2.0, n));
	}
}
