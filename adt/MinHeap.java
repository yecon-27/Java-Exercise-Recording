package com.ava.adt;
import java.util.ArrayList;
import java.util.List;

public class MinHeap {
    private List<Integer> heap;

    // Constructor to initialize the heap
    public MinHeap() {
        heap = new ArrayList<>();
    }

    // Insert method
    public void insert(int value) {
        heap.add(value);  // Add new value at the end
        int i = heap.size() - 1;  // Index of the new element
        // Bubble up to maintain min-heap property
        while (i > 0) {
            int parent = (i - 1) / 2;
            if (heap.get(i) < heap.get(parent)) {
                swap(i, parent);
                i = parent;
            } else {
                break;
            }
        }
    }

    // Extract min (root) element
    public int extractMin() {
        if (heap.isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        if (heap.size() == 1) {
            return heap.remove(0);
        }

        int minValue = heap.get(0);
        heap.set(0, heap.remove(heap.size() - 1));  // Move last element to root and remove last
        int i = 0;

        // Bubble down
        while (true) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int smallest = i;

            if (left < heap.size() && heap.get(left) < heap.get(smallest)) {
                smallest = left;
            }
            if (right < heap.size() && heap.get(right) < heap.get(smallest)) {
                smallest = right;
            }
            if (smallest != i) {
                swap(i, smallest);
                i = smallest;
            } else {
                break;
            }
        }

        return minValue;
    }

    // Helper method to swap elements at two indices
    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    // Main method to test the min heap
    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();

        // Insert 256 elements (values from 1 to 256 for simplicity)
        for (int value = 1; value <= 256; value++) {
            minHeap.insert(value);
        }

        // Extract min element
        int minValue = minHeap.extractMin();
        System.out.println("Minimum value: " + minValue);
    }
}
