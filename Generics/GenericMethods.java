package com.ava.Generics;
//Adding double to concrete the E generic parameter type
public class GenericMethods<E> {
//Ye Cong 1306248
	public static void main(String[] args) {
		//Actual/Concrete Type: Integer + String
		//Abstract/Generic parameter type: E
		Integer [] num = {1, 2, 3, 4, 5};
		String [] str = {"London", "Paris", "New York", "Beijing", "Amsterdam"};
		GenericMethods.<Integer>display(num);
		GenericMethods.<String>display(str);
	}
	public static <E> void display(E[] list) {
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		System.out.println();
		}
	}
}
