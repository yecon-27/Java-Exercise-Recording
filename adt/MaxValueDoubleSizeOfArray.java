package com.ava.adt;

public class MaxValueDoubleSizeOfArray {
	static int max;
	static int[] myList = new int[2];
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Array last index: " + (myList.length - 1));
		max = myList[0];
		System.out.println("Enter " + myList.length +" Values ot -1 to end: ");
		for (int i =0; i < myList.length; i++) {
			myList[i] = input.nextInt();
			if (myList[i] == -1) {
				systemAbort(myList);
				
			}
			if(myList.length - 1 == i) {
				int[] newArr = doubleArray(myList);
				myList = newArr;
			}
			System.out.println("Array: ");
			for (int e : myList) {
				System.out.print(e + " ");
			}
			max(myList);
		}
		input.close();
		} 
	
	public static void systemAbort(int[] value) {
		for (int i = 0; i < value.length; i++) {
			System.out.println("End of input!");
			System.exit(0);
		}
	}
	public static void max(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				System.out.println("max is: " + max);
			}
		}
	}
	public static int[] doubleArray(int[] list) {
		int[] newList = new int[list.length * 2];
		System.out.println("New array size is: " + newList.length);
		System.out.println("New array last index is: " + (newList.length - 1));
		System.out.println("Enter"  + newList.length + "Values: ");
		for (int i = 0; i < myList.length; i++) {
			newList[i] = myList[i];
		}
		myList = newList;
		return myList;
	
	}
}
