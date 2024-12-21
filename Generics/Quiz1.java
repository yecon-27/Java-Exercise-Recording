package com.ava.Generics;
//Ye Cong 1306248
public class Quiz1<E> {

	public static void main(String[] args) {
		Integer [] num = {1, 2, 3, 4, 5};
		String [] str = {"London", "Paris", "New York", "Beijing", "Amsterdam"};
		Double [] number = {1.0, 2.0, 3.0, 4.0, 5.0};
		GenericMethods.<Integer>display(num);
		GenericMethods.<String>display(str);
		GenericMethods.<Double>display(number);
	}
	public static <E> void display(E[] list) {
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		System.out.println();
		}
	}

	

}
