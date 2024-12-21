package com.ava.adt;

public class GenericQueueApp {

	public static void main(String[] args) {
		GenericQueue<Integer> q = new GenericQueue<>();
        q.enqueue(1);
        q.enqueue(2);
        q.dequeue();
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        System.out.println(q);
        
    }
}

