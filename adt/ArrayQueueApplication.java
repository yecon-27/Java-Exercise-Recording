package com.ava.adt;

public class ArrayQueueApplication {

	public static void main(String[] args) throws MyQueueException{
		ArrayQueue<Integer> array = new ArrayQueue<>();
			array.enqueue(1);
			array.enqueue(2);
			array.enqueue(3);
			array.enqueue(4);
			array.enqueue(5);
			array.enqueue(6);
		
		System.out.println(array.size());
		System.out.println(array.dequeue());
		System.out.println(array.isEmpty());
		System.out.println(array.dequeue());
		System.out.println(array.dequeue());
		System.out.println(array.dequeue());
	}

}
