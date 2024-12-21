package com.ava.TimeComplexity;

public class BruteForce {

	public static void main(String[] args) {
		int[] array = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512};
		int num = 512;
		bruteforce(array,num);

	}
	public static void bruteforce(int[] arr, int n) {
		for(int i =0; i < arr.length; i++) {
			if (arr[i] == n) {
				System.out.println("Found " + arr[i] + " at index " + i);
			}
		}
	}

}
