package com.ava.adt;

public class HashCodeLongType {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("Bitwise x^y = " + (x ^ y));//xor
		System.out.println("Bitwise x|y = " + (x | y));//logical or
		
		long key1 = 1234567890000000000L;
		long key2 = 1234567890000000024L;
		
		int hashcode1 = (int)(key1 ^(key1 >> 32));
		int hashcode2 = (int)(key2 ^(key2 >> 32));
		
		System.out.println("hashcode of key1 as an int type is " + hashcode1);
		System.out.println("hashcode of key2 as an int type is " + hashcode2);
		

	}

}
