package com.ava.adt;

public class ArrayQueueEmptyApplication {

	public static void main(String[] args) throws MyQueueException{
		ArrayQueue<Integer> array = new ArrayQueue<>();
		try {
		array.enqueue(1);
		array.enqueue(2);
		array.enqueue(3);
		array.enqueue(4);
		array.enqueue(5);
		array.enqueue(6);
		}catch(MyQueueException e){
			System.out.println(e);
		}
	System.out.println(array.size());
	System.out.println(array.dequeue());
	System.out.println(array.isEmpty());
	System.out.println(array.dequeue());
	System.out.println(array.dequeue());
	System.out.println(array.dequeue());
	System.out.println(array.dequeue());
	System.out.println(array.dequeue());
	}

}
