package com.ava.adt;

public class BitwiseRightShift {

	public static void main(String[] args) {
		int x = 67;
		int y = 77;
		long n = 1234567890000000000L;
		long m = 1234567890000001024L;
		
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(y));
		System.out.println(Long.toString(n));
		System.out.println(Long.toString(m));
		
		System.out.println("67 >> 4 is " + (x >> 4));
		System.out.println("77 >> 4 is " + (y >> 4));
		
		System.out.println(n >> 32);
		System.out.println(m >> 32);

	}

}
