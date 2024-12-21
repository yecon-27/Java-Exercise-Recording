package com.ava.Generics;
//Ye Cong 1306248
public class GenericStackApp2 {

	public static void main(String[] args) {
		GenericStack<String> num = new GenericStack<>();
		num.push("London");
		num.push("Paris");
		num.push("Beijing");
		num.push("Ken");
		num.push("Ava");
		System.out.println("Size:" + num.getSize());
		System.out.println("After peek:" + num.peek());
		System.out.println("Pop1:" +num.pop());
		System.out.println("Pop2:" +num.pop());
		System.out.println("Size:" + num.getSize());
		System.out.println("isEmpty:" + num.isEmpty());
		System.out.println(num.toString());

	}

}
