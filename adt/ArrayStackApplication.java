package com.ava.adt;

public class ArrayStackApplication {

	public static void main(String[] args) throws MyStackEmptyException {
		ArrayStack<Integer> array = new ArrayStack<>();
		try {
			array.push(1);
			array.push(2);
			array.push(3);
			array.push(4);
			array.push(5);
			array.push(6);
			
		}catch(MyStackFullException e) {
			System.out.println(e);
		}
		System.out.println(array.size());
		System.out.println(array.pop());
		System.out.println(array.isEmpty());
		System.out.println(array.pop());
		System.out.println(array.pop());
		System.out.println(array.pop());
		System.out.println(array.pop());
	}

}
