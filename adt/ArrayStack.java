package com.ava.adt;

public class ArrayStack<E> implements Stack<E>{
	public static final int CAPACITY = 5;
	private E[] data;
	private int t = -1;
	public ArrayStack() {this(CAPACITY);}
	public ArrayStack(int capacity) {
		data = (E[])new Object[capacity];
	}

	public int size() {
		return (t+1);
	}
	public boolean isEmpty() {
		return (t == -1);
	}
	public void push(E e) throws MyStackFullException{
		if(size() == data.length)
			throw new MyStackFullException("Ava's stack is full");
		data[++t] = e;
		
	}
	public E top() throws MyStackEmptyException{
		if(isEmpty())
			throw new MyStackEmptyException("Ava's stack is empty");
		return data[t];
}
	public E pop() throws MyStackEmptyException{
		if(isEmpty())
			throw new MyStackEmptyException("Ava's stack is empty");
		E answer = data[t];
		data[t] = null;
		t--;
		return answer;
}
	

}
