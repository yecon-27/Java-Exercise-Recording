package com.ava.adt;

public class ArrayQueue<E> implements Queue<E>{
	public static final int CAPACITY = 5;
	private E[] data;
	private int f = 0;
	private int sz = 0;
	
	public ArrayQueue() {
		this(CAPACITY);
	}
	public ArrayQueue(int capacity) {
		data = (E[])new Object[capacity];
	}
	public int size() {
		return sz;
	}
	public boolean isEmpty() {
		return sz == 0;
	}
	public void enqueue(E e) throws MyQueueException{
		if(sz == data.length)
			throw new MyQueueException("Ava's queue is full");
		int avail = (f + sz) % data.length;
		data[avail] = e;
		sz++;
		
	}
	public E first() throws MyQueueException{
		if(isEmpty())
			throw new MyQueueException("Ava's queue is empty");
		return data[f];
}
	public E dequeue() throws MyQueueException{
		if(isEmpty())
			throw new MyQueueException("Ava's queue is empty");
		E answer = data[f];
		data[f] = null;
		int avail = (f + sz) % data.length;
		sz--;
		return answer;
}
}
