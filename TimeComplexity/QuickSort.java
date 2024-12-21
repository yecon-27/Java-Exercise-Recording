package com.ava.TimeComplexity;

public class QuickSort {
    public static long startTime;
    public static long endTime;
    public static int stepsTaken;

    public static void main(String[] args) {
        int[] list = {2, 3, 2, 6, 5, 1, -2, 3, 17, 12, 2, 3, 2, 6, 5, 1, -2, 3, 17, 12};
        startTime = System.nanoTime();
        quickSort(list);
        endTime = System.nanoTime();
        
        System.out.println("Execution time is: " + (endTime - startTime) + " nanoseconds");
        System.out.println("Run time is: " + stepsTaken + " steps");
        
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public static void quickSort(int[] list) {
        quickSort(list, 0, list.length - 1);
    }

    public static void quickSort(int[] list, int first, int last) {
        if (last > first) {
            stepsTaken++;
            int pivotIndex = partition(list, first, last);
            quickSort(list, first, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, last);
        }
    }

    public static int partition(int[] list, int first, int last) {
        int pivot = list[first];
        int low = first + 1;
        int high = last;

        while (high > low) {
            while (low <= high && list[low] <= pivot) {
                stepsTaken++;
                low++;
            }
            while (low <= high && list[high] > pivot) {
                stepsTaken++;
                high--;
            }
            if (high > low) {
                stepsTaken++;
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        while (high > first && list[high] >= pivot) {
            stepsTaken++;
            high--;
        }

        if (pivot > list[high]) {
            stepsTaken++;
            list[first] = list[high];
            list[high] = pivot;
            return high;
        } else {
            stepsTaken++;
            return first;
        }
    }
}