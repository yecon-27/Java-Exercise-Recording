package com.ava.TimeComplexity;

public class MergeSort {
public static long startTime;
public static long endTime;
public static int stepsTaken;
	public static void main(String[] args) {
		int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 17, 12, 2, 3, 2, 6, 5, 1, -2, 3, 17, 12};
		startTime = System.nanoTime();
		mergeSort(list);
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
		System.out.println("Execution Time is:" + (endTime - startTime));
		System.out.println("Run time is:" + stepsTaken);
	}
	public static void mergeSort(int[] list) {
		if (list.length > 1) {
			stepsTaken++;
			int[] firstHalf = new int[list.length / 2];
			System.arraycopy(list, 0 , firstHalf, 0 , list.length / 2);
		mergeSort(firstHalf);
		
		int secondHalfLength = list.length - list.length / 2;
		int[] secondHalf = new int[secondHalfLength];
		System.arraycopy(list,  list.length / 2, secondHalf , 0 ,secondHalf.length);
		mergeSort(secondHalf);
		merge(firstHalf, secondHalf, list);
		}
		endTime = System.nanoTime();
	}
	public static void merge(int[] left, int[] right, int[] merged) {
		int lCurrIndex = 0;
		int rCurrIndex = 0;
		int mergedCurrIndex = 0;
		
		while(lCurrIndex < left.length && rCurrIndex < right.length) {
			if(left[lCurrIndex] < right[rCurrIndex]) {
				stepsTaken++;
				merged[mergedCurrIndex++] = left[lCurrIndex++];
				
			}else {
				stepsTaken++;
				merged[mergedCurrIndex++] = right[rCurrIndex++];
			}
		
		}while(lCurrIndex < left.length) {
			stepsTaken++;
			merged[mergedCurrIndex++] = left[lCurrIndex++];
			
		}while(rCurrIndex < right.length) {
			stepsTaken++;
			merged[mergedCurrIndex++] = right[rCurrIndex++];
		}
	}

}
