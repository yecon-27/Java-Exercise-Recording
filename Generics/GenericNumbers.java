package com.ava.Generics;
//Ye Cong 1306248
public class GenericNumbers<E> {
private E firstNumber;
private E secondNumber;

	public GenericNumbers(E first, E second) {
		firstNumber = first;
		secondNumber = second;
	}
	public E getFirstNumber() {
		return firstNumber;
	}
	public E getSecondNumber() {
		return secondNumber;
	}
	public void display() {
		System.out.println("First number is = " + firstNumber + "\n"
				+ "Second number is = " + secondNumber);
	}
}
