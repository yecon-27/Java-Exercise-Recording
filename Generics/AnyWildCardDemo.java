package com.ava.Generics;
//Ye Cong 1306248
public class AnyWildCardDemo {
//Wildcard Generics to substitude the Integer data type

	public static void main(String[] args) {
		GenericStack<Integer> intStack = new GenericStack<>();
		intStack.push(1);
		intStack.push(2);
		intStack.push(3);

		print(intStack);
	}
	//Substitude ? with ? extends Object(since Object is the upper limit of java structure)
	public static void print(GenericStack<? extends Object> stack) {
		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
	}
}
