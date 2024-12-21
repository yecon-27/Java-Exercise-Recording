package com.ava.adt;
//long->bit
public class DoubleHashCodeToLong {

	public static void main(String[] args) {
		long key1 = 1234567890000001024L;
		long key2 = 1234567890000000000L;
		
		long bits1 = Double.doubleToLongBits(key1);
		long bits2 = Double.doubleToLongBits(key2);
		
		System.out.println(Long.toBinaryString(bits1));
		System.out.println(Long.toBinaryString(bits2));
		
		int hashCode1 = (int)(bits1 ^ (bits1 >> 32));
		int hashCode2 = (int)(bits2 ^ (bits2 >> 32));
		
		
		System.out.println("hashcode of key1 as a double type is " + hashCode1);
		System.out.println("hashcode of key2 as a double type is " + hashCode2);

	}

}
