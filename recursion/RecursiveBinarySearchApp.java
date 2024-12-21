package com.ava.recursion;
import java.util.Arrays;
public class RecursiveBinarySearchApp {
//Ye Cong 1306248
	public static void main(String[] args) {
		int[] numbers = {8, 1, 3, 10, 7, 5, 4};
		int key = 7;
		Arrays.sort(numbers);
		RecursiveBinarySearch Rbs = new RecursiveBinarySearch();
		System.out.println("The key 7 locates at index " + RecursiveBinarySearch.recursiveBinarySearch(numbers, key));
	}

}
