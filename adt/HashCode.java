package com.ava.adt;

public class HashCode {
	public static void main(String[] args) {
		//bracket it: or it has type casting problem
		System.out.println("Does a and b the same?" + ("a".hashCode() == "b".hashCode()));

		System.out.println("89".hashCode());
		
	}
}
