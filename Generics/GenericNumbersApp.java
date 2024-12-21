package com.ava.Generics;
//Ye Cong 1306248
public class GenericNumbersApp<E> {//no error in application

	public static void main(String[] args) {
		GenericNumbers<Integer> num = new GenericNumbers<>(4, 9);
		num.display();//num.<Integer>display();

	}

}
