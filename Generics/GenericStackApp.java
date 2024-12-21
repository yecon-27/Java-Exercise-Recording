package com.ava.Generics;
//Ye Cong 1306248
public class GenericStackApp<E> {

	public static void main(String[] args) {
		GenericStack<Integer> num = new GenericStack<>();
		num.push(1);
		num.push(2);
		num.push(3);
		num.push(4);
		num.push(5);
		System.out.println("Size:" + num.getSize());
		System.out.println("After peek:" + num.peek());
		System.out.println("Pop1:" +num.pop());
		System.out.println("Pop2:" +num.pop());
		System.out.println("Size:" + num.getSize());
		System.out.println("isEmpty:" + num.isEmpty());
		System.out.println(num.toString());

	}

}
